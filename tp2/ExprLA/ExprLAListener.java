// Generated from ExprLA.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprLAParser}.
 */
public interface ExprLAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprLAParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprLAParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(ExprLAParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(ExprLAParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ExprLAParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ExprLAParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(ExprLAParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(ExprLAParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#ltgt}.
	 * @param ctx the parse tree
	 */
	void enterLtgt(ExprLAParser.LtgtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#ltgt}.
	 * @param ctx the parse tree
	 */
	void exitLtgt(ExprLAParser.LtgtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(ExprLAParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(ExprLAParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(ExprLAParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(ExprLAParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLAParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ExprLAParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLAParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ExprLAParser.AtomExprContext ctx);
}