import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.*;

public class simpleLangChecker extends AbstractParseTreeVisitor<Type> implements simpleLangVisitor<Type> {

    private final Map<String, Set<VariablePair>> symbolTable = new HashMap<>();

    private boolean addToLocalVariablesIfValid(String idfr, String type, String parent) {
        boolean valid = false;
        if (this.symbolTable.containsKey(idfr)) {
            throw new TypeException().clashedVarError();
        } else {
            Set<VariablePair> variablePairs = this.symbolTable.get(parent);
            VariablePair thisPair = new VariablePair(idfr, Type.returnType(type));
            valid = variablePairs.add(thisPair);
        }
        return valid;
    }

    @Override
    public Type visitProg(simpleLangParser.ProgContext ctx) {
        boolean mainMethod = false;
        boolean mainMethodIntReturn = false;
        for (simpleLangParser.DecContext dec: ctx.dec()) {
            visit(dec);
            if ( dec.IDFR().getText().equals("main") ) {
                mainMethod = true;
                if (dec.TYPE().getText().equals(Type.INT.getText()) ) {
                    mainMethodIntReturn = true;
                }
            }
        }
        if (!mainMethod) throw new TypeException().noMainFuncError();
        if (!mainMethodIntReturn && mainMethod) throw new TypeException().mainReturnTypeError();
        return Type.INT;
    }

    @Override
    public Type visitDec(simpleLangParser.DecContext ctx) {
        if (symbolTable.containsKey(ctx.IDFR().getText())) {
            throw new TypeException().duplicatedFuncError();
        } else {
            Set<VariablePair> li = new LinkedHashSet<>();
            li.add(new VariablePair(ctx.IDFR().getText(), Type.returnType(ctx.TYPE().getText())));
            symbolTable.put(ctx.IDFR().getText(), li);
        }

        visit(ctx.vardec());
        visit(ctx.body());
        return Type.UNIT;
    }
    public Type visitVardec(simpleLangParser.VardecContext ctx) {
        simpleLangParser.DecContext parent = (simpleLangParser.DecContext) ctx.getParent();
        String parentName = parent.IDFR().getText();
        System.out.println(parentName);
        for (int i = 0; i < ctx.IDFR().size(); i++) {
            String type = ctx.TYPE(i).getText();
            String idfr = ctx.IDFR(i).getText();
            boolean addedToVars = addToLocalVariablesIfValid(idfr, type, parentName);
            if (addedToVars == false) {
                throw new TypeException().duplicatedVarError();
            }
        }
        return Type.UNIT;
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
