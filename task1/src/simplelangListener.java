// Generated from /home/dan/Uni Work/Compilers/assignment/246619/task1/src/simplelang.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplelangParser}.
 */
public interface simplelangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simplelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(simplelangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(simplelangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplelangParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(simplelangParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(simplelangParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplelangParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(simplelangParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(simplelangParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplelangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(simplelangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(simplelangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplelangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(simplelangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(simplelangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplelangParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(simplelangParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(simplelangParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplelangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(simplelangParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(simplelangParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplelangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(simplelangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(simplelangParser.ArgsContext ctx);
}