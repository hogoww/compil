import org . antlr . v4 . runtime .*;

public class ExprArithASTTest {
    public static void main ( String [] argv ) {
	ANTLRInputStream stream =
	    new ANTLRInputStream(argv [0]);
	ExprArithASTLexer lexer=
	    new ExprArithASTLexer(stream);
	CommonTokenStream tokens=
	    new CommonTokenStream(lexer);
	ExprArithASTParser parser=
	    new ExprArithASTParser(tokens);
	System.out.println(parser.expr().value);
    }
}
