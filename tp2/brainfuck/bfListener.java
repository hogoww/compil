// Generated from bf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bfParser}.
 */
public interface bfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bfParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(bfParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(bfParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(bfParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(bfParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(bfParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(bfParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(bfParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(bfParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(bfParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(bfParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#exprLA}.
	 * @param ctx the parse tree
	 */
	void enterExprLA(bfParser.ExprLAContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#exprLA}.
	 * @param ctx the parse tree
	 */
	void exitExprLA(bfParser.ExprLAContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(bfParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(bfParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(bfParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(bfParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(bfParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(bfParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#ltgt}.
	 * @param ctx the parse tree
	 */
	void enterLtgt(bfParser.LtgtContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#ltgt}.
	 * @param ctx the parse tree
	 */
	void exitLtgt(bfParser.LtgtContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(bfParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(bfParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(bfParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(bfParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(bfParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(bfParser.AtomExprContext ctx);
}