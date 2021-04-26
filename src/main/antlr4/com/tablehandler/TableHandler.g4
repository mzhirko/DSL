 grammar TableHandler;

/*
 *----------------
 *  PARSER RULES
 *----------------
 */

main: stat* EOF;

stat: declaration   DELIMITER
    | assignment    DELIMITER
    | print         DELIMITER
    | tableExpr     DELIMITER
    | condition     
    ;

// Variable declaration
declaration: dataType ID;

// Variable assignment
assignment: ID '=' expr;

// Print expression
print: 'print' ID   #printVar
    |  'print' expr #printExpr
    ;

// Contitional statement
condition: ifStatement elseIfList* elseStatement?;

ifStatement: 'if' '(' boolExpr ')' conditionBlock;
elseIfList: 'else if' '(' boolExpr ')' conditionBlock;
elseStatement: 'else' conditionBlock;
conditionBlock: '{' stat* '}';

//Expressions
expr: n=numExpr
    | b=boolExpr
    | s=stringExpr
    | t=tableExpr
    ;

// Number expressions
numExpr returns [String value]:
         e1=numExpr op=('+'|'-'|'*'|'/') e2=numExpr  #Arithm
    |    '(' numExpr ')'                             #Par
    |    INTEGER                                     #Int
    |    DOUBLE                                      #Double
    |    ID                                          #Var
    ;

// Boolean expressions
boolExpr: e1=boolExpr op=('||'|'&&'|'=='|'!=') e2=boolExpr
    |     compareExpr
    |     BOOLEAN                                         
    |     ID                                              
    ;

// Compare expressions
compareExpr: e1=numExpr op=('=='|'!='|'<'|'>'|'<='|'>=') e2=numExpr;

// Tables
tableExpr: 'table(' 
    (      newTable
    |      addRow
    |      addRowFrom
    |      getValue
    |      setValue
    |      clearRow
    |      removeRow
    |      addCol
    |      addColFrom
    |      remCol
    |      clearField
    |      numColumns
    |      numRows
    |      uniqueCol
    |      getCol
    |      getRow
    |      getHeaderIndex
    |      subTableCol
    |      subTableCol2
    |      subTableRow
    |      subTableRow2
    |      add
    |      sub
    |      sort
    |      sortDesc
    |      equals
    |      export
    |      printTable
    |      printFirst
    |      printLast
    )      ')'
    ;

// Table operations base on Table.java
newTable: 'read' file 'to' ID;
addRow: 'add row' STRING 'to' ID; 
addRowFrom: 'add row' STRING 'at' INTEGER 'to' ID;
getValue: 'get value(' x=INTEGER ',' y=INTEGER ') from' ID;
setValue: 'insert into' ID 'value=' expr 'at cell(' x=INTEGER ',' y=INTEGER ')';
clearRow: 'clear row at' INTEGER 'from' ID;
removeRow: 'remove row at' INTEGER 'from' ID;
addCol: 'add column' STRING 'to' ID;
addColFrom: 'add column' STRING 'at' INTEGER 'to' ID;
remCol: 'remove column at' INTEGER 'from' ID;
clearField: 'clear field(' x=INTEGER ',' y=INTEGER ') from' ID;
numColumns: 'get col size from' ID;
numRows: 'get row size from' ID;
uniqueCol: 'get unique column from' ID 'at' INTEGER;
getCol: 'get column from' ID 'at' INTEGER 'header=' boolExpr;
getRow: 'get row from' ID 'at' INTEGER;
getHeaderIndex: 'get index from' ID 'of value=' stringExpr;
subTableCol: 'col-subtable from' ID 'start=' s=INTEGER 'end=' e=INTEGER;
subTableCol2: 'col-subtable from' ID 'start=' INTEGER;
subTableRow: 'row-subtable from' ID 'start=' s=INTEGER 'end=' e=INTEGER;
subTableRow2: 'row-subtable from' ID 'start=' INTEGER;
add: 'add' var1=ID 'with' var2=ID;
sub: 'subtract' var1=ID 'with' var2=ID;
sort: 'sort' ID;
sortDesc: 'sort descendent' ID;
equals: var1=ID 'equals' var2=ID;
export: 'export' ID 'to' file;
printTable: 'print' ID;
printFirst: 'print first' INTEGER 'lines of' ID;
printLast: 'print last' INTEGER 'lines of' ID;

// String expressions
stringExpr: STRING
    |       NULL
    ;

// Data types
dataType: 'int'
    |     'double'
    |     'table' 
    |     'boolean'
    |     'string'
    ;

// Fragments
file: ID '.csv';
NULL: 'null';
BOOLEAN: ('true' | 'false');

/*
 *----------------
 *  LEXER RULES
 *----------------
 */

INTEGER: [0-9]+;
DOUBLE: [0-9]+'.'[0-9]+;
ID: [a-zA-Z0-9_]+;
DELIMITER: ';';
STRING: ('"' (~'"')* '"');
SL_COMMENT: '//' .*? '\n' -> skip; // Single line comment
ML_COMMENT: '/*' .*? '*/' -> skip; // Multi line comment
WS: [ \t\r\n]+ -> skip;