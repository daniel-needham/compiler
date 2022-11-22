import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws Exception {
        //char stream reads from sys input
        CharStream input = CharStreams.fromStream(System.in);
        //creates a lexer than takes the input
        simpleLangLexer lexer = new simpleLangLexer(input);
        //create a buffer of tokens from lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //create a parser of tokens from the token buffer
        simpleLangParser parser = new simpleLangParser(tokens);
        ParseTree tree = parser.prog(); //begin parsing

    }
}