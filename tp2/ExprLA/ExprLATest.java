import org . antlr . v4 . runtime .*;
public class ExprLATest {
    public static void main ( String [] argv ) {
	ANTLRInputStream stream =
	    new ANTLRInputStream ( argv [0]);
	ExprLALexer lexer =
	    new ExprLALexer ( stream );
	CommonTokenStream tokens =
	    new CommonTokenStream ( lexer );
	ExprLAParser parser =
	    new ExprLAParser ( tokens );
	System . out . println ( parser . expr (). value );
    }
}
