// Generated from SeQueLa.g4 by ANTLR 4.5.3
package grammar;

    import t3.*;
      import static t3.TabelaDeSimbolos.*;
      import static t3.MyErrorListener.*;
      import static t3.GeradorDeCodigo.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeQueLaParser}.
 */
public interface SeQueLaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(SeQueLaParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(SeQueLaParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(SeQueLaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(SeQueLaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(SeQueLaParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(SeQueLaParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SeQueLaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SeQueLaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#ent}.
	 * @param ctx the parse tree
	 */
	void enterEnt(SeQueLaParser.EntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#ent}.
	 * @param ctx the parse tree
	 */
	void exitEnt(SeQueLaParser.EntContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#modificador_ent}.
	 * @param ctx the parse tree
	 */
	void enterModificador_ent(SeQueLaParser.Modificador_entContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#modificador_ent}.
	 * @param ctx the parse tree
	 */
	void exitModificador_ent(SeQueLaParser.Modificador_entContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(SeQueLaParser.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(SeQueLaParser.AtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#mais_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterMais_declaracao(SeQueLaParser.Mais_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#mais_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitMais_declaracao(SeQueLaParser.Mais_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(SeQueLaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(SeQueLaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#dec_composto}.
	 * @param ctx the parse tree
	 */
	void enterDec_composto(SeQueLaParser.Dec_compostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#dec_composto}.
	 * @param ctx the parse tree
	 */
	void exitDec_composto(SeQueLaParser.Dec_compostoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(SeQueLaParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(SeQueLaParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_binaria}.
	 * @param ctx the parse tree
	 */
	void enterRel_binaria(SeQueLaParser.Rel_binariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_binaria}.
	 * @param ctx the parse tree
	 */
	void exitRel_binaria(SeQueLaParser.Rel_binariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_n}.
	 * @param ctx the parse tree
	 */
	void enterRel_n(SeQueLaParser.Rel_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_n}.
	 * @param ctx the parse tree
	 */
	void exitRel_n(SeQueLaParser.Rel_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_esq}.
	 * @param ctx the parse tree
	 */
	void enterRel_esq(SeQueLaParser.Rel_esqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_esq}.
	 * @param ctx the parse tree
	 */
	void exitRel_esq(SeQueLaParser.Rel_esqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#rel_dir}.
	 * @param ctx the parse tree
	 */
	void enterRel_dir(SeQueLaParser.Rel_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#rel_dir}.
	 * @param ctx the parse tree
	 */
	void exitRel_dir(SeQueLaParser.Rel_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#participacao}.
	 * @param ctx the parse tree
	 */
	void enterParticipacao(SeQueLaParser.ParticipacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#participacao}.
	 * @param ctx the parse tree
	 */
	void exitParticipacao(SeQueLaParser.ParticipacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#alt}.
	 * @param ctx the parse tree
	 */
	void enterAlt(SeQueLaParser.AltContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#alt}.
	 * @param ctx the parse tree
	 */
	void exitAlt(SeQueLaParser.AltContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#excl}.
	 * @param ctx the parse tree
	 */
	void enterExcl(SeQueLaParser.ExclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#excl}.
	 * @param ctx the parse tree
	 */
	void exitExcl(SeQueLaParser.ExclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#exibe}.
	 * @param ctx the parse tree
	 */
	void enterExibe(SeQueLaParser.ExibeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#exibe}.
	 * @param ctx the parse tree
	 */
	void exitExibe(SeQueLaParser.ExibeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#insrt}.
	 * @param ctx the parse tree
	 */
	void enterInsrt(SeQueLaParser.InsrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#insrt}.
	 * @param ctx the parse tree
	 */
	void exitInsrt(SeQueLaParser.InsrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#colunas}.
	 * @param ctx the parse tree
	 */
	void enterColunas(SeQueLaParser.ColunasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#colunas}.
	 * @param ctx the parse tree
	 */
	void exitColunas(SeQueLaParser.ColunasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#coluna}.
	 * @param ctx the parse tree
	 */
	void enterColuna(SeQueLaParser.ColunaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#coluna}.
	 * @param ctx the parse tree
	 */
	void exitColuna(SeQueLaParser.ColunaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(SeQueLaParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(SeQueLaParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#slct}.
	 * @param ctx the parse tree
	 */
	void enterSlct(SeQueLaParser.SlctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#slct}.
	 * @param ctx the parse tree
	 */
	void exitSlct(SeQueLaParser.SlctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeQueLaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(SeQueLaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeQueLaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(SeQueLaParser.ExpressaoContext ctx);
}