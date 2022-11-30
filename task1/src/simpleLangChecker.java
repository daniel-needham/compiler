import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.*;

public class simpleLangChecker extends AbstractParseTreeVisitor<Type> implements simpleLangVisitor<Type> {

    private final Map<String, Map<String, Type>> symbolTable = new HashMap<>();

    private boolean addToLocalVariablesIfValid(String idfr, String type, String parent) {
        boolean valid = false;
        if (symbolTable.containsKey(idfr)) {
            throw new TypeException().clashedVarError();
        } else {
            Map<String, Type> localSymbolTable = symbolTable.get(parent);
            if (localSymbolTable.containsKey(idfr)) {
                throw new TypeException().duplicatedVarError();
            } else {
                localSymbolTable.put(idfr, Type.returnType(type));
                valid = true;
            }
        }
        return valid;
    }

    private String getDecParentAsString(RuleContext ctx) {
        while (!(ctx instanceof simpleLangParser.DecContext)) {
            ctx = ctx.getParent();
        }
        return ((simpleLangParser.DecContext) ctx).IDFR().getText();
    }

    @Override
    public Type visitProg(simpleLangParser.ProgContext ctx) {
        boolean mainMethod = false;
        boolean mainMethodIntReturn = false;
        //debug
        for (simpleLangParser.DecContext dec : ctx.dec()) {
            if (dec.IDFR().getText().equals("main")) {
                mainMethod = true;
                if (Type.returnType(dec.TYPE().getText()) != Type.INT) {
                    throw new TypeException().mainReturnTypeError();
                }
            }
            //from here
            if (symbolTable.containsKey(dec.IDFR().getText())) {
                throw new TypeException().duplicatedFuncError();
            } else {
                Map<String, Type> localVariableMap = new LinkedHashMap<>();
                localVariableMap.put(dec.IDFR().getText(), Type.returnType(dec.TYPE().getText()));
                symbolTable.put(dec.IDFR().getText(), localVariableMap);
            }
            //here
            visit(dec.vardec());
        }
        //debug
        for (simpleLangParser.DecContext dec : ctx.dec()) {
            visit(dec);
        }
        if (!mainMethod) throw new TypeException().noMainFuncError();
        return Type.INT;
    }


    //ITERATE THROUGH VARDEC FIRST - THEN LOOP THROUGHT VI
    @Override
    public Type visitDec(simpleLangParser.DecContext ctx) {
        Type decType = Type.returnType(ctx.TYPE().getText());

        //taken from here

        if (visit(ctx.body()) != decType) {
            System.out.println(visit(ctx.body()));
            throw new TypeException().functionBodyError();
        }
        return decType;
    }

    public Type visitVardec(simpleLangParser.VardecContext ctx) {
        String parentName = this.getDecParentAsString(ctx);
        for (int i = 0; i < ctx.IDFR().size(); i++) {
            String type = ctx.TYPE(i).getText();
            String idfr = ctx.IDFR(i).getText();
            if (Type.returnType(type) ==  Type.UNIT) throw new TypeException().unitVarError();
            addToLocalVariablesIfValid(idfr, type, parentName);
        }
        return Type.UNIT;
    }

    @Override
    public Type visitBody(simpleLangParser.BodyContext ctx) {
        String parentFuncName = this.getDecParentAsString(ctx);
        Map<String, Type> localVariableTable = symbolTable.get(parentFuncName);
        for (int i = 0; i < ctx.IDFR().size(); i++) {
            Type instanceVarType = Type.returnType(ctx.TYPE(i).getText());
            String idfr = ctx.IDFR(i).getText();
            Type variableTableType = localVariableTable.get(idfr);
            //name of function defined - throw ex
            if (symbolTable.containsKey(idfr)) throw new TypeException().clashedVarError();
            //add to symbol table if not already initialised
            if (variableTableType == null) {
                localVariableTable.put(idfr, instanceVarType);
            } else if (instanceVarType == Type.UNIT){
                throw new TypeException().unitVarError();
            }
            else if (instanceVarType != variableTableType) {
                throw new TypeException().assignmentError();
            }
        }
        return visit(ctx.ene());
    }

    @Override
    public Type visitBlock(simpleLangParser.BlockContext ctx) {
        return visit(ctx.ene());
    }

    @Override
    public Type visitEne(simpleLangParser.EneContext ctx) {
        for (int i = 0; i < ctx.exp().size(); i++) {
            visit(ctx.exp(i));
        }
        return visit(ctx.exp(ctx.exp().size() -1 )); //returns final expression type
    }

    @Override
    public Type visitIDFREXP(simpleLangParser.IDFREXPContext ctx) {
        String parentName = this.getDecParentAsString(ctx);
        if (symbolTable.get(parentName).containsKey(ctx.IDFR().getText())) {
            return symbolTable.get(parentName).get(ctx.IDFR().getText());
        } else {
            throw new TypeException().undefinedVarError();
        }
    }

    @Override
    public Type visitINTEXP(simpleLangParser.INTEXPContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitBOOLEXP(simpleLangParser.BOOLEXPContext ctx) {
        return Type.BOOL;
    }

    @Override
    public Type visitASSIGNEXP(simpleLangParser.ASSIGNEXPContext ctx) {
        String parentFuncName = this.getDecParentAsString(ctx);
        Map<String, Type> localVariableTable = symbolTable.get(parentFuncName);
        Type varType = localVariableTable.get(ctx.IDFR().getText());
        //add to symbol table if not already initialised
        if (varType == null) {
            localVariableTable.put(ctx.IDFR().getText(), visit(ctx.exp()));
        } else if (varType != visit(ctx.exp())) {
            throw new TypeException().assignmentError();
        }
        return Type.UNIT;
    }

    @Override
    public Type visitBINOPEXP(simpleLangParser.BINOPEXPContext ctx) {
        String parentFuncName = this.getDecParentAsString(ctx);
        Map<String, Type> localVariableTable = symbolTable.get(parentFuncName);
        String operator = ctx.BINOP().getText();
        switch (operator) {
            case "+":
            case "-":
            case "/":
            case "*": {
                if (visit(ctx.exp(0)) != Type.INT || visit(ctx.exp(1)) != Type.INT) {
                    throw new TypeException().arithmeticError();
                } else {
                    return Type.INT;
                }
            }
            case "==":
            case "<":
            case ">":
            case "<=":
            case ">=": {
                if (visit(ctx.exp(0)) != Type.INT || visit(ctx.exp(1)) != Type.INT) {
                    throw new TypeException().comparisonError();
                } else {
                    return Type.BOOL;
                }
            }
            case "&":
            case "|":
            case "^": {
                if (visit(ctx.exp(0)) != Type.BOOL || visit(ctx.exp(1)) != Type.BOOL) {
                    throw new TypeException().logicalError();
                } else {
                    return Type.BOOL;
                }
            }
            default: return Type.UNIT;
        }

    }

    @Override
    public Type visitFUNCEXP(simpleLangParser.FUNCEXPContext ctx) {

        String functionIDFR = ctx.IDFR().getText();
        if (symbolTable.containsKey(functionIDFR)) {
            //check arguments match
            //check type of each argument against the variables already defined
            // -1 to account for function type
            if (ctx.args().exp().size() != (symbolTable.get(functionIDFR).size() - 1)) {
                throw new TypeException().argumentNumberError();
            }
            visit(ctx.args());
            return symbolTable.get(functionIDFR).get(functionIDFR);
        } else {
            throw new TypeException().undefinedFuncError();
        }
    }

    @Override
    public Type visitBLOCKEXP(simpleLangParser.BLOCKEXPContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Type visitIFEXP(simpleLangParser.IFEXPContext ctx) {
        if (visit(ctx.exp()) != Type.BOOL) {
            throw new TypeException().conditionError();
        }
        //check if and else block are same type
        boolean typeMatch = (ctx.block().stream().map(this::visit).distinct().count() <= 1);
        if (!typeMatch) {
            throw new TypeException().branchMismatchError();
        }
        return visit(ctx.block(0));
    }

    @Override
    public Type visitWHILEEXP(simpleLangParser.WHILEEXPContext ctx) {
        if (visit(ctx.exp()) != Type.BOOL) {
            throw new TypeException().conditionError();
        }
        if (visit(ctx.block()) != Type.UNIT) {
            throw new TypeException().loopBodyError();
        }
        return visit(ctx.block());
    }

    @Override
    public Type visitREPEATEXP(simpleLangParser.REPEATEXPContext ctx) {
        if (visit(ctx.exp()) != Type.BOOL) {
            throw new TypeException().conditionError();
        }
        if (visit(ctx.block()) != Type.UNIT) {
            throw new TypeException().loopBodyError();
        }
        return visit(ctx.block());
    }

    @Override
    public Type visitPRINTEXP(simpleLangParser.PRINTEXPContext ctx) {
        if (visit(ctx.exp()) == Type.BOOL) {
            throw new TypeException().printError();
        }
        if (visit(ctx.exp()) == Type.UNIT) {
            if (ctx.exp() instanceof simpleLangParser.SPACEEXPContext || ctx.exp() instanceof simpleLangParser.NEWLINEXPContext){
                //all good
            } else {
                throw new TypeException().printError();
            }
        }
        return Type.UNIT;
    }

    @Override
    public Type visitSPACEEXP(simpleLangParser.SPACEEXPContext ctx) {
        return Type.UNIT;
    }

    @Override
    public Type visitNEWLINEXP(simpleLangParser.NEWLINEXPContext ctx) {
        return Type.UNIT;
    }

    @Override
    public Type visitSKIPEXP(simpleLangParser.SKIPEXPContext ctx) {
        return Type.UNIT;
    }

    @Override
    public Type visitArgs(simpleLangParser.ArgsContext ctx) {
        String funcName = ((simpleLangParser.FUNCEXPContext) ctx.getParent()).IDFR().getText();
        Map<String, Type> localVariableTable = symbolTable.get(funcName);
        List<Type> variableTypes = localVariableTable.values().stream().toList();
        for (int i = 0; i < ctx.exp().size(); i++) {
            if (visit(ctx.exp(i)) != variableTypes.get(i + 1)) {
                throw new TypeException().argumentError();
            }
        }
        return Type.UNIT;
    }
}
