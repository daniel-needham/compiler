// Generated from /home/dan/Uni Work/Compilers/assignment/246619/task1/src/simpleLang.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(simpleLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(simpleLangParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(simpleLangParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(simpleLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(simpleLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(simpleLangParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(simpleLangParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(simpleLangParser.ArgsContext ctx);
}