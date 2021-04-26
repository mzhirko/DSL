// Generated from com/tablehandler/TableHandler.g4 by ANTLR 4.5
package com.tablehandler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TableHandlerParser}.
 */
public interface TableHandlerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(TableHandlerParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(TableHandlerParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TableHandlerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TableHandlerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TableHandlerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TableHandlerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TableHandlerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TableHandlerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(TableHandlerParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(TableHandlerParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(TableHandlerParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(TableHandlerParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TableHandlerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TableHandlerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TableHandlerParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TableHandlerParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#elseIfList}.
	 * @param ctx the parse tree
	 */
	void enterElseIfList(TableHandlerParser.ElseIfListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#elseIfList}.
	 * @param ctx the parse tree
	 */
	void exitElseIfList(TableHandlerParser.ElseIfListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(TableHandlerParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(TableHandlerParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(TableHandlerParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(TableHandlerParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TableHandlerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TableHandlerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterPar(TableHandlerParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitPar(TableHandlerParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arithm}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithm(TableHandlerParser.ArithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arithm}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithm(TableHandlerParser.ArithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterVar(TableHandlerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitVar(TableHandlerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(TableHandlerParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(TableHandlerParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterInt(TableHandlerParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitInt(TableHandlerParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(TableHandlerParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(TableHandlerParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(TableHandlerParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(TableHandlerParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExpr(TableHandlerParser.TableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExpr(TableHandlerParser.TableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#newTable}.
	 * @param ctx the parse tree
	 */
	void enterNewTable(TableHandlerParser.NewTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#newTable}.
	 * @param ctx the parse tree
	 */
	void exitNewTable(TableHandlerParser.NewTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#addRow}.
	 * @param ctx the parse tree
	 */
	void enterAddRow(TableHandlerParser.AddRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#addRow}.
	 * @param ctx the parse tree
	 */
	void exitAddRow(TableHandlerParser.AddRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#addRowFrom}.
	 * @param ctx the parse tree
	 */
	void enterAddRowFrom(TableHandlerParser.AddRowFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#addRowFrom}.
	 * @param ctx the parse tree
	 */
	void exitAddRowFrom(TableHandlerParser.AddRowFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#getValue}.
	 * @param ctx the parse tree
	 */
	void enterGetValue(TableHandlerParser.GetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#getValue}.
	 * @param ctx the parse tree
	 */
	void exitGetValue(TableHandlerParser.GetValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#setValue}.
	 * @param ctx the parse tree
	 */
	void enterSetValue(TableHandlerParser.SetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#setValue}.
	 * @param ctx the parse tree
	 */
	void exitSetValue(TableHandlerParser.SetValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#clearRow}.
	 * @param ctx the parse tree
	 */
	void enterClearRow(TableHandlerParser.ClearRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#clearRow}.
	 * @param ctx the parse tree
	 */
	void exitClearRow(TableHandlerParser.ClearRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#removeRow}.
	 * @param ctx the parse tree
	 */
	void enterRemoveRow(TableHandlerParser.RemoveRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#removeRow}.
	 * @param ctx the parse tree
	 */
	void exitRemoveRow(TableHandlerParser.RemoveRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#addCol}.
	 * @param ctx the parse tree
	 */
	void enterAddCol(TableHandlerParser.AddColContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#addCol}.
	 * @param ctx the parse tree
	 */
	void exitAddCol(TableHandlerParser.AddColContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#addColFrom}.
	 * @param ctx the parse tree
	 */
	void enterAddColFrom(TableHandlerParser.AddColFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#addColFrom}.
	 * @param ctx the parse tree
	 */
	void exitAddColFrom(TableHandlerParser.AddColFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#remCol}.
	 * @param ctx the parse tree
	 */
	void enterRemCol(TableHandlerParser.RemColContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#remCol}.
	 * @param ctx the parse tree
	 */
	void exitRemCol(TableHandlerParser.RemColContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#clearField}.
	 * @param ctx the parse tree
	 */
	void enterClearField(TableHandlerParser.ClearFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#clearField}.
	 * @param ctx the parse tree
	 */
	void exitClearField(TableHandlerParser.ClearFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#numColumns}.
	 * @param ctx the parse tree
	 */
	void enterNumColumns(TableHandlerParser.NumColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#numColumns}.
	 * @param ctx the parse tree
	 */
	void exitNumColumns(TableHandlerParser.NumColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#numRows}.
	 * @param ctx the parse tree
	 */
	void enterNumRows(TableHandlerParser.NumRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#numRows}.
	 * @param ctx the parse tree
	 */
	void exitNumRows(TableHandlerParser.NumRowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#uniqueCol}.
	 * @param ctx the parse tree
	 */
	void enterUniqueCol(TableHandlerParser.UniqueColContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#uniqueCol}.
	 * @param ctx the parse tree
	 */
	void exitUniqueCol(TableHandlerParser.UniqueColContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#getCol}.
	 * @param ctx the parse tree
	 */
	void enterGetCol(TableHandlerParser.GetColContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#getCol}.
	 * @param ctx the parse tree
	 */
	void exitGetCol(TableHandlerParser.GetColContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#getRow}.
	 * @param ctx the parse tree
	 */
	void enterGetRow(TableHandlerParser.GetRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#getRow}.
	 * @param ctx the parse tree
	 */
	void exitGetRow(TableHandlerParser.GetRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#getHeaderIndex}.
	 * @param ctx the parse tree
	 */
	void enterGetHeaderIndex(TableHandlerParser.GetHeaderIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#getHeaderIndex}.
	 * @param ctx the parse tree
	 */
	void exitGetHeaderIndex(TableHandlerParser.GetHeaderIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#subTableCol}.
	 * @param ctx the parse tree
	 */
	void enterSubTableCol(TableHandlerParser.SubTableColContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#subTableCol}.
	 * @param ctx the parse tree
	 */
	void exitSubTableCol(TableHandlerParser.SubTableColContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#subTableCol2}.
	 * @param ctx the parse tree
	 */
	void enterSubTableCol2(TableHandlerParser.SubTableCol2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#subTableCol2}.
	 * @param ctx the parse tree
	 */
	void exitSubTableCol2(TableHandlerParser.SubTableCol2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#subTableRow}.
	 * @param ctx the parse tree
	 */
	void enterSubTableRow(TableHandlerParser.SubTableRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#subTableRow}.
	 * @param ctx the parse tree
	 */
	void exitSubTableRow(TableHandlerParser.SubTableRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#subTableRow2}.
	 * @param ctx the parse tree
	 */
	void enterSubTableRow2(TableHandlerParser.SubTableRow2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#subTableRow2}.
	 * @param ctx the parse tree
	 */
	void exitSubTableRow2(TableHandlerParser.SubTableRow2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(TableHandlerParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(TableHandlerParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(TableHandlerParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(TableHandlerParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(TableHandlerParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(TableHandlerParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#sortDesc}.
	 * @param ctx the parse tree
	 */
	void enterSortDesc(TableHandlerParser.SortDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#sortDesc}.
	 * @param ctx the parse tree
	 */
	void exitSortDesc(TableHandlerParser.SortDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(TableHandlerParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(TableHandlerParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(TableHandlerParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(TableHandlerParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#printTable}.
	 * @param ctx the parse tree
	 */
	void enterPrintTable(TableHandlerParser.PrintTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#printTable}.
	 * @param ctx the parse tree
	 */
	void exitPrintTable(TableHandlerParser.PrintTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#printFirst}.
	 * @param ctx the parse tree
	 */
	void enterPrintFirst(TableHandlerParser.PrintFirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#printFirst}.
	 * @param ctx the parse tree
	 */
	void exitPrintFirst(TableHandlerParser.PrintFirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#printLast}.
	 * @param ctx the parse tree
	 */
	void enterPrintLast(TableHandlerParser.PrintLastContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#printLast}.
	 * @param ctx the parse tree
	 */
	void exitPrintLast(TableHandlerParser.PrintLastContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(TableHandlerParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(TableHandlerParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(TableHandlerParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(TableHandlerParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(TableHandlerParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(TableHandlerParser.FileContext ctx);
}