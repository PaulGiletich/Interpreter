import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.parser.langAstTreeWalker;
import com.pgiletich.lang.parser.langLexer;
import com.pgiletich.lang.parser.langParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import java.io.IOException;

public class Interpreter {
    private static final boolean debug = false;

    public static void main(String[] args) throws Exception {
        if(debug) {
            loadFile("C:/Users/sfcpr_000/IdeaProjects/lang/test-sources/debug.ls");
        } else {
            loadFile("C:/Users/sfcpr_000/IdeaProjects/lang/standard-library/embeddedFunctions.ls");
            for(String file: args){
                loadFile(file);
            }
        }
    }

    public static void loadFile(String file) throws IOException, RecognitionException, EvaluatingException {
        langLexer lexer = new langLexer(new ANTLRFileStream(file));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langParser parser = new langParser(tokens);

        CommonTree tree = (CommonTree)parser.root().getTree();

        if(debug){
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(tree);
            System.out.println(st);
        }

        langAstTreeWalker walker = new langAstTreeWalker(new CommonTreeNodeStream(tree));
        LangNode root = walker.root().rootNode;
        root.evaluate();
    }
}
