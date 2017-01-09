// Generated from C:\Comp2\comp2T3\src\trabalho3\SeQueLa.g4 by ANTLR 4.2.2

    package grammar;
      import static t3.GeradorDeCodigo.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeQueLaParser}.
 */
public interface SeQueLaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_binaria}.
	 * @param ctx the parse tree
	 */
	void enterRel_binaria(@NotNull SeQueLaParser.Rel_binariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_binaria}.
	 * @param ctx the parse tree
	 */
	void exitRel_binaria(@NotNull SeQueLaParser.Rel_binariaContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_esq}.
	 * @param ctx the parse tree
	 */
	void enterRel_esq(@NotNull SeQueLaParser.Rel_esqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_esq}.
	 * @param ctx the parse tree
	 */
	void exitRel_esq(@NotNull SeQueLaParser.Rel_esqContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#alt}.
	 * @param ctx the parse tree
	 */
	void enterAlt(@NotNull SeQueLaParser.AltContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#alt}.
	 * @param ctx the parse tree
	 */
	void exitAlt(@NotNull SeQueLaParser.AltContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull SeQueLaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull SeQueLaParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#ent}.
	 * @param ctx the parse tree
	 */
	void enterEnt(@NotNull SeQueLaParser.EntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#ent}.
	 * @param ctx the parse tree
	 */
	void exitEnt(@NotNull SeQueLaParser.EntContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#mais_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterMais_declaracao(@NotNull SeQueLaParser.Mais_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#mais_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitMais_declaracao(@NotNull SeQueLaParser.Mais_declaracaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#excl}.
	 * @param ctx the parse tree
	 */
	void enterExcl(@NotNull SeQueLaParser.ExclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#excl}.
	 * @param ctx the parse tree
	 */
	void exitExcl(@NotNull SeQueLaParser.ExclContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(@NotNull SeQueLaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(@NotNull SeQueLaParser.DeclaracaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(@NotNull SeQueLaParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(@NotNull SeQueLaParser.RelContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_dir}.
	 * @param ctx the parse tree
	 */
	void enterRel_dir(@NotNull SeQueLaParser.Rel_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_dir}.
	 * @param ctx the parse tree
	 */
	void exitRel_dir(@NotNull SeQueLaParser.Rel_dirContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#dec_composto}.
	 * @param ctx the parse tree
	 */
	void enterDec_composto(@NotNull SeQueLaParser.Dec_compostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#dec_composto}.
	 * @param ctx the parse tree
	 */
	void exitDec_composto(@NotNull SeQueLaParser.Dec_compostoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#participacao}.
	 * @param ctx the parse tree
	 */
	void enterParticipacao(@NotNull SeQueLaParser.ParticipacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#participacao}.
	 * @param ctx the parse tree
	 */
	void exitParticipacao(@NotNull SeQueLaParser.ParticipacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#modificador_ent}.
	 * @param ctx the parse tree
	 */
	void enterModificador_ent(@NotNull SeQueLaParser.Modificador_entContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#modificador_ent}.
	 * @param ctx the parse tree
	 */
	void exitModificador_ent(@NotNull SeQueLaParser.Modificador_entContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(@NotNull SeQueLaParser.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(@NotNull SeQueLaParser.AtributosContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_n}.
	 * @param ctx the parse tree
	 */
	void enterRel_n(@NotNull SeQueLaParser.Rel_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_n}.
	 * @param ctx the parse tree
	 */
	void exitRel_n(@NotNull SeQueLaParser.Rel_nContext ctx);

	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#exibe}.
	 * @param ctx the parse tree
	 */
	void enterExibe(@NotNull SeQueLaParser.ExibeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#exibe}.
	 * @param ctx the parse tree
	 */
	void exitExibe(@NotNull SeQueLaParser.ExibeContext ctx);
}