// Generated from com/tablehandler/TableHandler.g4 by ANTLR 4.5
package com.tablehandler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TableHandlerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TableHandlerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(TableHandlerParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TableHandlerParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TableHandlerParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TableHandlerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(TableHandlerParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(TableHandlerParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TableHandlerParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TableHandlerParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#elseIfList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfList(TableHandlerParser.ElseIfListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(TableHandlerParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(TableHandlerParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TableHandlerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(TableHandlerParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arithm}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm(TableHandlerParser.ArithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(TableHandlerParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(TableHandlerParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TableHandlerParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(TableHandlerParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(TableHandlerParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpr(TableHandlerParser.TableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#newTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTable(TableHandlerParser.NewTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#addRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddRow(TableHandlerParser.AddRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#addRowFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddRowFrom(TableHandlerParser.AddRowFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#getValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetValue(TableHandlerParser.GetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#setValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetValue(TableHandlerParser.SetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#clearRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearRow(TableHandlerParser.ClearRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#removeRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveRow(TableHandlerParser.RemoveRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#addCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCol(TableHandlerParser.AddColContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#addColFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColFrom(TableHandlerParser.AddColFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#remCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemCol(TableHandlerParser.RemColContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#clearField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearField(TableHandlerParser.ClearFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#numColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumColumns(TableHandlerParser.NumColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#numRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumRows(TableHandlerParser.NumRowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#uniqueCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueCol(TableHandlerParser.UniqueColContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#getCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCol(TableHandlerParser.GetColContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#getRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetRow(TableHandlerParser.GetRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#getHeaderIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetHeaderIndex(TableHandlerParser.GetHeaderIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#subTableCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTableCol(TableHandlerParser.SubTableColContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#subTableCol2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTableCol2(TableHandlerParser.SubTableCol2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#subTableRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTableRow(TableHandlerParser.SubTableRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#subTableRow2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTableRow2(TableHandlerParser.SubTableRow2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(TableHandlerParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(TableHandlerParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(TableHandlerParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#sortDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDesc(TableHandlerParser.SortDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(TableHandlerParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(TableHandlerParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#printTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintTable(TableHandlerParser.PrintTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#printFirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFirst(TableHandlerParser.PrintFirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#printLast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintLast(TableHandlerParser.PrintLastContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(TableHandlerParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(TableHandlerParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TableHandlerParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(TableHandlerParser.FileContext ctx);
}