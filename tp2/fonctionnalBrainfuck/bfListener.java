// Generated from bf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bfParser}.
 */
public interface bfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bfParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(bfParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(bfParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(bfParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(bfParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#declarationVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationVar(bfParser.DeclarationVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#declarationVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationVar(bfParser.DeclarationVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(bfParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(bfParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(bfParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(bfParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(bfParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(bfParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(bfParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(bfParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#expre}.
	 * @param ctx the parse tree
	 */
	void enterExpre(bfParser.ExpreContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#expre}.
	 * @param ctx the parse tree
	 */
	void exitExpre(bfParser.ExpreContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#instruct}.
	 * @param ctx the parse tree
	 */
	void enterInstruct(bfParser.InstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#instruct}.
	 * @param ctx the parse tree
	 */
	void exitInstruct(bfParser.InstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#accesTab}.
	 * @param ctx the parse tree
	 */
	void enterAccesTab(bfParser.AccesTabContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#accesTab}.
	 * @param ctx the parse tree
	 */
	void exitAccesTab(bfParser.AccesTabContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(bfParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(bfParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link bfParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(bfParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link bfParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(bfParser.ProcedureContext ctx);
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