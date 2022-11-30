import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class simpleLangInterpreter extends AbstractParseTreeVisitor<Type> implements simpleLangVisitor<Type> {

    @Override
    public Type visitProg(simpleLangParser.ProgContext ctx) {
        return null;
    }

    @Override
    public Type visitDec(simpleLangParser.DecContext ctx) {
        return null;
    }

    @Override
    public Type visitVardec(simpleLangParser.VardecContext ctx) {
        return null;
    }

    @Override
    public Type visitBody(simpleLangParser.BodyContext ctx) {
        return null;
    }

    @Override
    public Type visitBlock(simpleLangParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Type visitEne(simpleLangParser.EneContext ctx) {
        return null;
    }

    @Override
    public Type visitIDFREXP(simpleLangParser.IDFREXPContext ctx) {
        return null;
    }

    @Override
    public Type visitINTEXP(simpleLangParser.INTEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitBOOLEXP(simpleLangParser.BOOLEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitASSIGNEXP(simpleLangParser.ASSIGNEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitBINOPEXP(simpleLangParser.BINOPEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitFUNCEXP(simpleLangParser.FUNCEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitBLOCKEXP(simpleLangParser.BLOCKEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitIFEXP(simpleLangParser.IFEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitWHILEEXP(simpleLangParser.WHILEEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitREPEATEXP(simpleLangParser.REPEATEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitPRINTEXP(simpleLangParser.PRINTEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitSPACEEXP(simpleLangParser.SPACEEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitNEWLINEXP(simpleLangParser.NEWLINEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitSKIPEXP(simpleLangParser.SKIPEXPContext ctx) {
        return null;
    }

    @Override
    public Type visitArgs(simpleLangParser.ArgsContext ctx) {
        return null;
    }
}
