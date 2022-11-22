// Generated from /home/dan/Uni Work/Compilers/assignment/246619/task1/src/simpleLang.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(simpleLangParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(simpleLangParser.ExpContext ctx);
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