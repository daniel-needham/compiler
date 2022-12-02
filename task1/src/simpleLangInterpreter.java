import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class simpleLangInterpreter extends AbstractParseTreeVisitor<Object> implements simpleLangVisitor<Object> {

    private final Deque<Frame> stack = new ArrayDeque<>();
    private final HashMap<String, simpleLangParser.DecContext> functionTable = new HashMap<>();

    //everytime a function is called pushed to the stack an actviation record, as we pop off we visit the
    public Integer visitProgram(simpleLangParser.ProgContext ctx, String[] args) {
        simpleLangParser.DecContext main = null;
        for (simpleLangParser.DecContext dec : ctx.dec()) {

            if (dec.IDFR().getText().equals("main")) {
                main = dec;
            } else {
                functionTable.put(dec.IDFR().getText(), dec);
            }
        }
        Frame mainStackFrame = new Frame("main");
        //TODO main args can pass boolean, update to allow this
        for (int j = 0; j < args.length; j++) {
            mainStackFrame.addVariable(main.vardec().IDFR(j).getText(), returnArg(args[j]));
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
        return visit(ctx.ene());
    }

    @Override
    public Object visitEne(simpleLangParser.EneContext ctx) {
        for (int i = 0; i < ctx.exp().size() - 1; i++) {
            visit(ctx.exp(i));
        }
        return visit(ctx.exp(ctx.exp().size() - 1));
    }

    @Override
    public Object visitIDFREXP(simpleLangParser.IDFREXPContext ctx) {
        Frame invokedFuncMemory = stack.peek();
        return invokedFuncMemory.getVariable(ctx.IDFR().getText());
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
        Frame invokedFuncMemory = stack.peek();
        invokedFuncMemory.reassignVariable(ctx.IDFR().getText(), visit(ctx.exp()));
        return null;
    }

    @Override
    public Object visitBINOPEXP(simpleLangParser.BINOPEXPContext ctx) {
        String operator = ctx.BINOP().getText();
        if (binopTakesIntegers(operator)) {
            Integer lhs = (Integer) visit(ctx.exp(0));
            Integer rhs = (Integer) visit(ctx.exp(1));
            switch (operator) {
                case "+": {
                    return lhs + rhs;
                }
                case "-": {
                    return lhs - rhs;
                }
                case "/": {
                    return lhs / rhs;
                }
                case "*": {
                    return lhs * rhs;
                }
                case "==": {
                    return lhs.equals(rhs);
                }
                case "<": {
                    return lhs < rhs;
                }
                case ">": {
                    return lhs > rhs;
                }
                case "<=": {
                    return lhs <= rhs;
                }
                case ">=": {
                    return lhs >= rhs;
                }
            }
        } else {
            Boolean lhs = (Boolean) visit(ctx.exp(0));
            Boolean rhs = (Boolean) visit(ctx.exp(1));
            switch (operator) {
                case "&": {
                    return lhs && rhs;
                }
                case "|": {
                    return lhs || (Boolean) rhs;
                }
                case "^": {
                    return lhs ^ rhs;
                }
            }
        }
        return null;
    }

    @Override
    public Object visitFUNCEXP(simpleLangParser.FUNCEXPContext ctx) {
        simpleLangParser.DecContext function = functionTable.get(ctx.IDFR().getText());
        List<TerminalNode> variableNames = function.vardec().IDFR();
        Frame stackFrame = new Frame(ctx.IDFR().getText(), stack.peek());
        for (int j = 0; j < ctx.args().exp().size(); j++) {
            stackFrame.addVariable(variableNames.get(j).getText(), visit(ctx.args().exp(j)));
        }
        stack.push(stackFrame);
        return visit(function.body());
    }

    @Override
    public Object visitBLOCKEXP(simpleLangParser.BLOCKEXPContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Object visitIFEXP(simpleLangParser.IFEXPContext ctx) {
        Object returnValue = null;
        Boolean bool = (Boolean) visit(ctx.exp());
        if (bool) {
            returnValue = visit(ctx.block(0));
        } else if (ctx.block().size() > 1) {
            returnValue = visit(ctx.block(1));
        }
        //if(returnValue == null) throw new RuntimeException("returning if statement that didnt fire");
        return returnValue;
    }

    @Override
    public Object visitWHILEEXP(simpleLangParser.WHILEEXPContext ctx) {
        while ((Boolean)visit(ctx.exp())) {
            visit(ctx.block());
        }
        return null;
    }

    @Override
    public Object visitREPEATEXP(simpleLangParser.REPEATEXPContext ctx) {
        do {visit(ctx.block());}
        while ((Boolean)visit(ctx.exp()));
        return null;
    }

    @Override
    public Object visitPRINTEXP(simpleLangParser.PRINTEXPContext ctx) {
        System.out.println(String.valueOf(visit(ctx.exp())));
        return null;
    }

    @Override
    public Object visitSPACEEXP(simpleLangParser.SPACEEXPContext ctx) {
        return " ";
    }

    @Override
    public Object visitNEWLINEXP(simpleLangParser.NEWLINEXPContext ctx) {
        return "\n";
    }

    @Override
    public Object visitSKIPEXP(simpleLangParser.SKIPEXPContext ctx) {
        return null;
    }

    @Override
    public Object visitArgs(simpleLangParser.ArgsContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    private boolean binopTakesIntegers(String s) {
        ArrayList<String> integerReady = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "==", "<", ">", "<=", "=>"));
        ArrayList<String> booleanReady = new ArrayList<>(Arrays.asList("^", "&", "|"));
        if (integerReady.contains(s)) return true;
        if (booleanReady.contains(s)) return false;
        throw new RuntimeException("something went wrong with BINOP");
    }

    private Object returnArg(String str) {
        if (str.matches("0")) {
            return Integer.parseInt(str);
        } else if (str.matches("[1-9][0-9]*")) {
            return Integer.parseInt(str);
        } else {
            return Boolean.parseBoolean(str);
        }
    }
}
