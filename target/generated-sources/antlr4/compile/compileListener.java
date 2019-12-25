// Generated from compile\compile.g4 by ANTLR 4.5
package compile;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compileParser}.
 */
public interface compileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compileParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(compileParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(compileParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(compileParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(compileParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(compileParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(compileParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(compileParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(compileParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#define_stat}.
	 * @param ctx the parse tree
	 */
	void enterDefine_stat(compileParser.Define_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#define_stat}.
	 * @param ctx the parse tree
	 */
	void exitDefine_stat(compileParser.Define_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(compileParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(compileParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(compileParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(compileParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(compileParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(compileParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(compileParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(compileParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(compileParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(compileParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#writeEnd}.
	 * @param ctx the parse tree
	 */
	void enterWriteEnd(compileParser.WriteEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#writeEnd}.
	 * @param ctx the parse tree
	 */
	void exitWriteEnd(compileParser.WriteEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(compileParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(compileParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(compileParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(compileParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(compileParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(compileParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(compileParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(compileParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(compileParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(compileParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(compileParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(compileParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(compileParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(compileParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(compileParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(compileParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(compileParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(compileParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(compileParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link compileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(compileParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(compileParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(compileParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(compileParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(compileParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(compileParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(compileParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(compileParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(compileParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(compileParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(compileParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(compileParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link compileParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(compileParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(compileParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(compileParser.TypeContext ctx);
}