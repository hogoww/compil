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
}