grammar eziql;

/*
 * Parser Rules
 */

parse: (eziql_statement_list)* EOF
;

eziql_statement_list:
    SCOL* eziql_statement (SCOL+ eziql_statement)* SCOL*
;

eziql_statement: (EXPLAIN_ (QUERY_ PLAN_)?)? (
        edit_table_statement
        | analyze_statement
        | create_index_statement
        | create_table_statement
        | create_view_statement
        | insert_statement
        | delete_statement
        | delete_statement_limited
        | pragma_statement
        | select_statement
   
    )
;

edit_table_statement:
    EDIT_ TABLE_ (schema_name DOT)? table_name (
        RENAME_ (
            TO_ new_table_name
            | COLUMN_? old_column_name = column_name TO_ new_column_name = column_name
        )
        | ADD_ COLUMN_? column_def
    )
;

analyze_statement:
    ANALYZE_ (schema_name | (schema_name DOT)? table_or_index_name)?
;

create_index_statement:
    CREATE_ UNIQUE_? INDEX_ (IF_ NOT_ EXISTS_)? (schema_name DOT)? index_name ON_ table_name OPEN_PAR
        indexed_column (COMMA indexed_column)* CLOSE_PAR (WHERE_ expr)?
;

indexed_column: (column_name | expr) (COLLATE_ collation_name)? asc_desc?
;

create_table_statement:
    CREATE_ (TEMP_ | TEMPORARY_)? TABLE_ (IF_ NOT_ EXISTS_)? (
        schema_name DOT
    )? table_name (
        OPEN_PAR column_def (COMMA column_def)*? (COMMA table_constraint)* CLOSE_PAR (
            WITHOUT_ row_ROW_ID = IDENTIFIER
        )?
        | AS_ select_statement
    )
;

column_def:
    column_name type_name? column_constraint*
;


type_name:
    name+? (
        OPEN_PAR signed_number CLOSE_PAR
        | OPEN_PAR signed_number COMMA signed_number CLOSE_PAR
    )?
;

column_constraint: (CONSTRAINT_ name)? (
        (PRIMARY_ KEY_ asc_desc? conflict_clause?)
        | (NOT_ NULL_ | UNIQUE_) conflict_clause?
        | CHECK_ OPEN_PAR expr CLOSE_PAR
        | DEFAULT_ (signed_number | literal_value | OPEN_PAR expr CLOSE_PAR)
        | foreign_key_clause
        | (GENERATED_ ALWAYS_)? AS_ OPEN_PAR expr CLOSE_PAR (STORED_)?
    )
;

signed_number: (PLUS | MINUS)? NUMERIC_LITERAL
;

table_constraint: (CONSTRAINT_ name)? (
        (PRIMARY_ KEY_ | UNIQUE_) OPEN_PAR indexed_column (
            COMMA indexed_column
        )* CLOSE_PAR conflict_clause?
        | CHECK_ OPEN_PAR expr CLOSE_PAR
        | FOREIGN_ KEY_ OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR foreign_key_clause
    )
;

foreign_key_clause:
    REFERENCES_ foreign_table (
        OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR
    )? (
        ON_ DELETE_ (
            SET_ NULL_
            | RESTRICT_
            | NO_ ACTION_
        )
    )* ?
;

conflict_clause:
    ON_ CONFLICT_ (
        ROLLBACK_
        | ABORT_
        | FAIL_
        | IGNORE_
        | REPLACE_
    )
;

create_view_statement:
    CREATE_ (TEMP_ | TEMPORARY_)? VIEW_ (IF_ NOT_ EXISTS_)? (
        schema_name DOT
    )? view_name (OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR)? AS_ select_statement
;

common_table_expression:
    table_name (OPEN_PAR column_name ( COMMA column_name)* CLOSE_PAR)? AS_ OPEN_PAR select_statement CLOSE_PAR
;

delete_statement:
    DELETE_ FROM_ qualified_table_name (WHERE_ expr)?
;

delete_statement_limited:
    DELETE_ FROM_ qualified_table_name (WHERE_ expr)? (
        order_by_statement? limit_statement
    )?
;

/*
 Binary operators:
    * / %
    + -
    & |
    < <= > >=
    = != <> IS NOT IN LIKE
    AND
    OR
 */

expr:
    literal_value
    | BIND_PARAMETER
    | ((schema_name DOT)? table_name DOT)? column_name
    | unary_operator expr
    | expr ( STAR | DIV | MOD) expr
    | expr ( PLUS | MINUS) expr
    | expr ( AMP | PIPE) expr
    | expr ( LT | LT_EQ | GT | GT_EQ) expr
    | expr (
        ASSIGN
        | EQ
        | NOT_EQ
        | IS_
        | IS_ NOT_
        | IN_
        | LIKE_
    ) expr
    | expr AND_ expr
    | expr OR_ expr
    | function_name OPEN_PAR ((expr ( COMMA expr)*) | STAR)? CLOSE_PAR filter_clause?
    | OPEN_PAR expr (COMMA expr)* CLOSE_PAR
    | expr NOT_? LIKE_ expr (
        ESCAPE_ expr
    )?
    | expr ( ISNULL_ | NOTNULL_ | NOT_ NULL_)
    | expr IS_ NOT_? expr
    | expr NOT_? IN_ (
        OPEN_PAR (select_statement | expr ( COMMA expr)*)? CLOSE_PAR
        | ( schema_name DOT)? table_name
        | (schema_name DOT)? table_function_name OPEN_PAR (expr (COMMA expr)*)? CLOSE_PAR
    )
    | ((NOT_)? EXISTS_)? OPEN_PAR select_statement CLOSE_PAR
    | CASE_ expr? (WHEN_ expr THEN_ expr)+ (ELSE_ expr)? END_
    | raise_function
;

raise_function:
    RAISE_ OPEN_PAR (
        IGNORE_
        | (ROLLBACK_ | ABORT_ | FAIL_) COMMA error_message
    ) CLOSE_PAR
;

literal_value:
    NUMERIC_LITERAL
    | STRING_LITERAL
    | NULL_
    | TRUE_
    | FALSE_
;

insert_statement:    
    INSERT_
    | REPLACE_
    | INSERT_ OR_ (
        REPLACE_
        | ROLLBACK_
        | ABORT_
        | FAIL_
        | IGNORE_
     )
     INTO_ (schema_name DOT)? table_name (AS_ table_alias)? (
        OPEN_PAR column_name ( COMMA column_name)* CLOSE_PAR
    )? (
        VALUES_ OPEN_PAR expr (COMMA expr)* CLOSE_PAR (
            COMMA OPEN_PAR expr ( COMMA expr)* CLOSE_PAR
        )*
            | select_statement
    )
    | DEFAULT_ VALUES_
;

pragma_statement:
    PRAGMA_ (schema_name DOT)? pragma_name (
        ASSIGN pragma_value
        | OPEN_PAR pragma_value CLOSE_PAR
    )?
;

pragma_value:
    signed_number
    | name
    | STRING_LITERAL
;

select_statement:
   select_core (select_core)* order_by_statement? limit_statement?
;

select_core:
    (
        SELECT_ (DISTINCT_ | ALL_)? result_column (COMMA result_column)* (           
            FROM_ (table_or_subquery (COMMA table_or_subquery)*)
        )? (WHERE_ expr)? (GROUP_ BY_ expr (COMMA expr)* (HAVING_ expr)?)? 
    )
    | VALUES_ OPEN_PAR expr (COMMA expr)* CLOSE_PAR (
        COMMA OPEN_PAR expr ( COMMA expr)* CLOSE_PAR
    )*
;

factored_select_statement:
    select_statement
;

simple_select_statement:
   select_core order_by_statement? limit_statement?
;

compound_select_statement:
   select_core (
        (UNION_ ALL_? | INTERSECT_ | EXCEPT_) select_core
    )+ order_by_statement? limit_statement?
;

table_or_subquery: (
        (schema_name DOT)? table_name (AS_? table_alias)? 
    )
    | (schema_name DOT)? table_function_name OPEN_PAR expr (COMMA expr)* CLOSE_PAR (
        AS_? table_alias
    )?
    | OPEN_PAR (table_or_subquery (COMMA table_or_subquery)* ) CLOSE_PAR
    | OPEN_PAR select_statement CLOSE_PAR (AS_? table_alias)?
;

result_column:
    STAR
    | table_name DOT STAR
    | expr ( AS_? column_alias)?
;


column_name_list:
    OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR
;

qualified_table_name: (schema_name DOT)? table_name (AS_ alias)? (
        INDEXED_ BY_ index_name
        | NOT_ INDEXED_
    )?
;

filter_clause:
    FILTER_ OPEN_PAR WHERE_ expr CLOSE_PAR
;

order_by_statement:
    ORDER_ BY_ ordering_term (COMMA ordering_term)*
;

limit_statement:
    LIMIT_ expr (COMMA expr)?
;

ordering_term:
    expr asc_desc?
;

asc_desc:
    ASC_
    | DESC_
;

of_OF_fset:
    COMMA signed_number
;

default_DEFAULT__value:
    COMMA signed_number
;

partition_by:
    PARTITION_ BY_ expr+
;

order_by_expr:
    ORDER_ BY_ expr+
;

order_by_expr_asc_desc:
    ORDER_ BY_ order_by_expr_asc_desc
;

expr_asc_desc:
    expr asc_desc? (COMMA expr asc_desc?)*
;

unary_operator:
    MINUS
    | PLUS
    | TILDE
    | NOT_
;

error_message:
    STRING_LITERAL
;

column_alias:
    IDENTIFIER
    | STRING_LITERAL
;

keyword:
    ABORT_
    | ACTION_
    | ADD_
    | ALL_
    | ANALYZE_
    | AND_
    | AS_
    | ASC_
    | BY_
    | CASE_
    | CHECK_
    | COLUMN_
    | CONFLICT_
    | CONSTRAINT_
    | COLLATE_
    | CREATE_
    | DEFAULT_
    | DELETE_
    | DISTINCT_
    | DESC_
    | DETACH_
    | ELSE_
    | EDIT_
    | END_
    | ESCAPE_
    | EXCEPT_
    | EXISTS_
    | EXPLAIN_
    | FAIL_
    | FOR_
    | FOREIGN_
    | FROM_
    | GROUP_
    | HAVING_
    | IF_
    | IGNORE_
    | IN_
    | FOLLOWING_
    | INDEX_
    | INDEXED_
    | INSERT_
    | INTERSECT_
    | INTO_
    | IS_
    | ISNULL_
    | KEY_
    | LIKE_
    | LIMIT_
    | NO_
    | NOT_
    | NOTNULL_
    | NULL_
    | OF_
    | ON_
    | OR_
    | ORDER_
    | OUTER_
    | PLAN_
    | PRAGMA_
    | PRIMARY_
    | QUERY_
    | RAISE_
    | REFERENCES_
    | RENAME_
    | REPLACE_
    | RESTRICT_
    | RIGHT_
    | ROLLBACK_
    | ROW_
    | ROWS_
    | SELECT_
    | SET_
    | TABLE_
    | TEMP_
    | TEMPORARY_
    | THEN_
    | TO_
    | UNION_
    | UNIQUE_
    | USING_
    | VALUES_
    | VIEW_
    | VIRTUAL_
    | WHEN_
    | WHERE_
    | WITH_
    | WITHOUT_
    | FIRST_VALUE_
    | OVER_
    | PARTITION_
    | RANGE_
    | PRECEDING_
    | FOLLOWING_
    | LAG_
    | LAST_VALUE_
    | LEAD_
    | NTH_VALUE_
    | NTILE_
    | PERCENT_RANK_
    | RANK_
    | ROW_NUMBER_
    | GENERATED_
    | ALWAYS_
    | STORED_
    | TRUE_
    | FALSE_
    | NULLS_
    | FIRST_
    | LAST_
    | FILTER_
    | GROUPS_
;

name:
    any_name
;

function_name:
    any_name
;

schema_name:
    any_name
;

table_name:
    any_name
;

table_or_index_name:
    any_name
;

new_table_name:
    any_name
;

column_name:
    any_name
;

collation_name:
    any_name
;

foreign_table:
    any_name
;

index_name:
    any_name
;

view_name:
    any_name
;

module_name:
    any_name
;

pragma_name:
    any_name
;


table_alias:
    any_name
;


alias:
    any_name
;

filename:
    any_name
;


simple_func:
    any_name
;

aggregate_func:
    any_name
;

table_function_name:
    any_name
;


any_name:
    IDENTIFIER
    | keyword
    | STRING_LITERAL
    | OPEN_PAR any_name CLOSE_PAR
;


/*
 * Lexer Rules
 */

SCOL:      ';';
DOT:       '.';
OPEN_PAR:  '(';
CLOSE_PAR: ')';
COMMA:     ',';
ASSIGN:    '=';
STAR:      '*';
PLUS:      '+';
MINUS:     '-';
TILDE:     '~';
DIV:       '/';
MOD:       '%';
AMP:       '&';
PIPE:      '|';
LT:        '<';
LT_EQ:     '<=';
GT:        '>';
GT_EQ:     '>=';
EQ:        '==';
NOT_EQ:   '!=';


ABORT_:             A B O R T;
ACTION_:            A C T I O N;
ADD_:               A D D;
ALL_:               A L L;
ANALYZE_:           A N A L Y Z E;
AND_:               A N D;
AS_:                A S;
ASC_:               A S C;
BY_:                B Y;
CASE_:              C A S E;
CHECK_:             C H E C K;
COLUMN_:            C O L U M N;
CONFLICT_:          C O N F L I C T;
CONSTRAINT_:        C O N S T R A I N T;
COLLATE_:           C O L L A T E;
CREATE_:            C R E A T E;
DEFAULT_:           D E F A U L T;
DELETE_:            D E L E T E;
DESC_:              D E S C;
DISTINCT_:          D I S T I N C T;
FOLLOWING_:         F O L L O W I N G;
DETACH_:            D E T A C H;
ELSE_:              E L S E;
EDIT_:              E D I T;
END_:               E N D;
ESCAPE_:            E S C A P E;
EXCEPT_:            E X C E P T;
EXISTS_:            E X I S T S;
EXPLAIN_:           E X P L A I N;
FAIL_:              F A I L;
FOR_:               F O R;
FOREIGN_:           F O R E I G N;
FROM_:              F R O M;
GROUP_:             G R O U P;
HAVING_:            H A V I N G;
IF_:                I F;
IGNORE_:            I G N O R E;
IN_:                I N;
INDEX_:             I N D E X;
INDEXED_:           I N D E X E D;
INSERT_:            I N S E R T;
INTERSECT_:         I N T E R S E C T;
INTO_:              I N T O;
IS_:                I S;
ISNULL_:            I S N U L L;
KEY_:               K E Y;
LIKE_:              L I K E;
LIMIT_:             L I M I T;
NO_:                N O;
NOT_:               N O T;
NOTNULL_:           N O T N U L L;
NULL_:              N U L L;
OF_:                O F;
ON_:                O N;
OR_:                O R;
ORDER_:             O R D E R;
OUTER_:             O U T E R;
PLAN_:              P L A N;
PRAGMA_:            P R A G M A;
PRIMARY_:           P R I M A R Y;
QUERY_:             Q U E R Y;
RAISE_:             R A I S E;
REFERENCES_:        R E F E R E N C E S;
RENAME_:            R E N A M E;
REPLACE_:           R E P L A C E;
RESTRICT_:          R E S T R I C T;
RIGHT_:             R I G H T;
ROLLBACK_:          R O L L B A C K;
ROW_:               R O W;
ROWS_:              R O W S;
SELECT_:            S E L E C T;
SET_:               S E T;
TABLE_:             T A B L E;
TEMP_:              T E M P;
TEMPORARY_:         T E M P O R A R Y;
THEN_:              T H E N;
TO_:                T O;
UNION_:             U N I O N;
UNIQUE_:            U N I Q U E;
USING_:             U S I N G;
VALUES_:            V A L U E S;
VIEW_:              V I E W;
VIRTUAL_:           V I R T U A L;
WHEN_:              W H E N;
WHERE_:             W H E R E;
WITH_:              W I T H;
WITHOUT_:           W I T H O U T;
FIRST_VALUE_:       F I R S T '_' V A L U E;
OVER_:              O V E R;
PARTITION_:         P A R T I T I O N;
RANGE_:             R A N G E;
PRECEDING_:         P R E C E D I N G;
LAG_:               L A G;
LAST_VALUE_:        L A S T '_' V A L U E;
LEAD_:              L E A D;
NTH_VALUE_:         N T H '_' V A L U E;
NTILE_:             N T I L E;
PERCENT_RANK_:      P E R C E N T '_' R A N K;
RANK_:              R A N K;
ROW_NUMBER_:        R O W '_' N U M B E R;
GENERATED_:         G E N E R A T E D;
ALWAYS_:            A L W A Y S;
STORED_:            S T O R E D;
TRUE_:              T R U E;
FALSE_:             F A L S E;
NULLS_:             N U L L S;
FIRST_:             F I R S T;
LAST_:              L A S T;
FILTER_:            F I L T E R;
GROUPS_:            G R O U P S;
EXCLUDE_:           E X C L U D E;

IDENTIFIER:
    '"' (~'"' | '""')* '"'
    | '`' (~'`' | '``')* '`'
    | '[' ~']'* ']'
    | [a-zA-Z_] [a-zA-Z_0-9]*
;

NUMERIC_LITERAL: ((DIGIT+ ('.' DIGIT*)?) | ('.' DIGIT+)) (E [-+]? DIGIT+)? | '0x' HEX_DIGIT+;

BIND_PARAMETER: '?' DIGIT* | [:@$] IDENTIFIER;

STRING_LITERAL: '\'' ( ~'\'' | '\'\'')* '\'';

BLOB_LITERAL: X STRING_LITERAL;

SINGLE_LINE_COMMENT: '--' ~[\r\n]* (('\r'? '\n') | EOF) -> channel(HIDDEN);

MULTILINE_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);

SPACES: [ \u000B\t\r\n] -> channel(HIDDEN);

UNEXPECTED_CHAR: .;

fragment HEX_DIGIT: [0-9a-fA-F];
fragment DIGIT:     [0-9];

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];