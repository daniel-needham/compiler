import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;
import java.util.Map;

public class simpleLangChecker extends AbstractParseTreeVisitor<Types> implements simpleLangVisitor<Types> {

    private final Map<String, Types> localVariables = new HashMap<>();

    @Override
    public Types visitProg(simpleLangParser.ProgContext ctx) {
        return null;
    }

    @Override
    public Types visitDec(simpleLangParser.DecContext ctx) {
        return null;
    }

    @Override
    public Types visitVardec(simpleLangParser.VardecContext ctx) {
        return null;
    }

    @Override
    public Types visitBody(simpleLangParser.BodyContext ctx) {
        return null;
    }

    @Override
    public Types visitBlock(simpleLangParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Types visitEne(simpleLangParser.EneContext ctx) {
        return null;
    }

    @Override
    public Types visitExp(simpleLangParser.ExpContext ctx) {
        return null;
    }

    @Override
    public Types visitArgs(simpleLangParser.ArgsContext ctx) {
        return null;
    }
}
