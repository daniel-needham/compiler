// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleLangParser}.
 */
public interface simpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(simpleLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(simpleLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleLangParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(simpleLangParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(simpleLangParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleLangParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(simpleLangParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(simpleLangParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(simpleLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(simpleLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(simpleLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(simpleLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleLangParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(simpleLangParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(simpleLangParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDFREXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIDFREXP(simpleLangParser.IDFREXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDFREXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIDFREXP(simpleLangParser.IDFREXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterINTEXP(simpleLangParser.INTEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitINTEXP(simpleLangParser.INTEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBOOLEXP(simpleLangParser.BOOLEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBOOLEXP(simpleLangParser.BOOLEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGNEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterASSIGNEXP(simpleLangParser.ASSIGNEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGNEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitASSIGNEXP(simpleLangParser.ASSIGNEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BINOPEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBINOPEXP(simpleLangParser.BINOPEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BINOPEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBINOPEXP(simpleLangParser.BINOPEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFUNCEXP(simpleLangParser.FUNCEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFUNCEXP(simpleLangParser.FUNCEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BLOCKEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBLOCKEXP(simpleLangParser.BLOCKEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BLOCKEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBLOCKEXP(simpleLangParser.BLOCKEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIFEXP(simpleLangParser.IFEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIFEXP(simpleLangParser.IFEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHILEEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterWHILEEXP(simpleLangParser.WHILEEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHILEEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitWHILEEXP(simpleLangParser.WHILEEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code REPEATEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterREPEATEXP(simpleLangParser.REPEATEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code REPEATEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitREPEATEXP(simpleLangParser.REPEATEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRINTEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPRINTEXP(simpleLangParser.PRINTEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRINTEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPRINTEXP(simpleLangParser.PRINTEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SPACEEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSPACEEXP(simpleLangParser.SPACEEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SPACEEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSPACEEXP(simpleLangParser.SPACEEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEWLINEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNEWLINEXP(simpleLangParser.NEWLINEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEWLINEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNEWLINEXP(simpleLangParser.NEWLINEXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SKIPEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSKIPEXP(simpleLangParser.SKIPEXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SKIPEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSKIPEXP(simpleLangParser.SKIPEXPContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleLangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(simpleLangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(simpleLangParser.ArgsContext ctx);
}