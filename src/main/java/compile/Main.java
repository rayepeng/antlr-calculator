package compile;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/compile/test2"};
        }

        System.out.println("parsing: " + args[0]);

        compileLexer lexer = new compileLexer(new ANTLRFileStream(args[0]));
        compileParser parser = new compileParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
