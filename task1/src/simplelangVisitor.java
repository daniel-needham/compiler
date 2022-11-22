// Generated from /home/dan/Uni Work/Compilers/assignment/246619/task1/src/simplelang.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simplelangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simplelangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simplelangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(simplelangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplelangParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(simplelangParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplelangParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(simplelangParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplelangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(simplelangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplelangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(simplelangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplelangParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(simplelangParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplelangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(simplelangParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplelangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(simplelangParser.ArgsContext ctx);
}