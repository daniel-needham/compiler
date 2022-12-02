import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class simpleLangInterpreter extends AbstractParseTreeVisitor<Object> implements simpleLangVisitor<Object> {

    private final Deque<Frame> stack = new ArrayDeque<>();
    private final HashMap<String, simpleLangParser.DecContext> functionTable = new HashMap<>();

    //everytime a function is called pushed to the stack an actviation record, as we pop off we visit the
    public Integer visitProgram(simpleLangParser.ProgContext ctx, String[] args) {
        simpleLangParser.DecContext main = null;
        for (simpleLangParser.DecContext dec : ctx.dec()) {

            if (dec.IDFR().getText().equals("main")){
                main = dec;
                System.out.println("triggers");
            } else {
                functionTable.put(dec.IDFR().getText(), dec);
            }
        }
        Frame mainStackFrame =  new Frame("main");
        //TODO main args can pass boolean, update to allow this
        for (int j = 0; j < args.length; j++) {
            mainStackFrame.addVariable(main.vardec().IDFR(j).getText(), Integer.parseInt(args[j]));
        }
        stack.push(mainStackFrame);
        return (Integer) visit(main.body()); //visit body
    }
    @Override
    public Object visitProg(simpleLangParser.ProgContext ctx) {
        throw new RuntimeException("DONT NEED!");
    }
    @Override
    public Object visitDec(simpleLangParser.DecContext ctx) {
        return visit(ctx.body());
    }

    @Override
    public Object visitVardec(simpleLangParser.VardecContext ctx) {
        return null;
    }

    @Override
    public Object visitBody(simpleLangParser.BodyContext ctx) {
        Frame invokedFuncMemory = stack.peek();
        for (int i = 0; i < ctx.exp().size(); i++) {
            invokedFuncMemory.addVariable(ctx.IDFR(i).getText(), visit(ctx.exp(i)));
        }
        Object returnValue = visit(ctx.ene());
        stack.pop();
        return returnValue;
    }

    @Override
    public Object visitBlock(simpleLangParser.BlockContext ctx) {
        return null;
    }
    @Override
    public Object visitEne(simpleLangParser.EneContext ctx) {
        for (int i = 0; i < ctx.exp().size() - 1; i++) {
            visit(ctx.exp(i));
        }
        return visit(ctx.exp(ctx.exp().size()-1));
    }

    @Override
    public Object visitIDFREXP(simpleLangParser.IDFREXPContext ctx) {
        return null;
    }

    @Override
    public Object visitINTEXP(simpleLangParser.INTEXPContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Object visitBOOLEXP(simpleLangParser.BOOLEXPContext ctx) {
        return Boolean.parseBoolean(ctx.getText().toLowerCase());
    }

    @Override
    public Object visitASSIGNEXP(simpleLangParser.ASSIGNEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitBINOPEXP(simpleLangParser.BINOPEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitFUNCEXP(simpleLangParser.FUNCEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitBLOCKEXP(simpleLangParser.BLOCKEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitIFEXP(simpleLangParser.IFEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitWHILEEXP(simpleLangParser.WHILEEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitREPEATEXP(simpleLangParser.REPEATEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitPRINTEXP(simpleLangParser.PRINTEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitSPACEEXP(simpleLangParser.SPACEEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitNEWLINEXP(simpleLangParser.NEWLINEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitSKIPEXP(simpleLangParser.SKIPEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitArgs(simpleLangParser.ArgsContext ctx) {
        return null;
    }
}
