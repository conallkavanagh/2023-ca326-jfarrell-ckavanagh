import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;

public class placeholder
{

	public static void main (String[] args) throws Exception
	{
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
			
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream (inputFile);
			
        placeholderLexer lexer = new placeholderLexer (CharStreams.fromStream (is));
		CommonTokenStream tokens = new CommonTokenStream (lexer);
		placeholderParser parser = new placeholderParser (tokens);
		ParseTree tree = parser.prog ();

        placeholderDisplayVisitor placeholderV = new placeholderDisplayVisitor ();
		placeholderV.visit (tree);
	}
}