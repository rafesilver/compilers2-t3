// Generated from C:\Comp2\comp2T3\src\trabalho3\SeQueLa.g4 by ANTLR 4.2.2

    package grammar;
      import static t3.GeradorDeCodigo.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SeQueLaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SeQueLaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#rel_binaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_binaria(@NotNull SeQueLaParser.Rel_binariaContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#rel_esq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_esq(@NotNull SeQueLaParser.Rel_esqContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#alt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlt(@NotNull SeQueLaParser.AltContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull SeQueLaParser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#ent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnt(@NotNull SeQueLaParser.EntContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#mais_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_declaracao(@NotNull SeQueLaParser.Mais_declaracaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#excl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcl(@NotNull SeQueLaParser.ExclContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(@NotNull SeQueLaParser.DeclaracaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(@NotNull SeQueLaParser.RelContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#rel_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_dir(@NotNull SeQueLaParser.Rel_dirContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#dec_composto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_composto(@NotNull SeQueLaParser.Dec_compostoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#participacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticipacao(@NotNull SeQueLaParser.ParticipacaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#modificador_ent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificador_ent(@NotNull SeQueLaParser.Modificador_entContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#atributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos(@NotNull SeQueLaParser.AtributosContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#rel_n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_n(@NotNull SeQueLaParser.Rel_nContext ctx);

	/**
	 * Visit a parse tree produced by {@link SeQueLaParser#exibe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExibe(@NotNull SeQueLaParser.ExibeContext ctx);
}