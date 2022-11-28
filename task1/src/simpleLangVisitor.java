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
	 * Visit a parse tree produced by the {@code IDFREXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDFREXP(simpleLangParser.IDFREXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTEXP(simpleLangParser.INTEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOLEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOLEXP(simpleLangParser.BOOLEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGNEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGNEXP(simpleLangParser.ASSIGNEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BINOPEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBINOPEXP(simpleLangParser.BINOPEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCEXP(simpleLangParser.FUNCEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BLOCKEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBLOCKEXP(simpleLangParser.BLOCKEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFEXP(simpleLangParser.IFEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHILEEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILEEXP(simpleLangParser.WHILEEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code REPEATEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitREPEATEXP(simpleLangParser.REPEATEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRINTEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRINTEXP(simpleLangParser.PRINTEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SPACEEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSPACEEXP(simpleLangParser.SPACEEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEWLINEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEWLINEXP(simpleLangParser.NEWLINEXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SKIPEXP}
	 * labeled alternative in {@link simpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSKIPEXP(simpleLangParser.SKIPEXPContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleLangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(simpleLangParser.ArgsContext ctx);
}