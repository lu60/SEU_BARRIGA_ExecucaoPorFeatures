package Steps;

import Pages.CriarMovimentacaoDataFuturaPage;
import Pages.CriarMovimentacaoPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CriarMovimentacaoDataFuturaStep extends RunSeuBarriga {
    CriarMovimentacaoPage criarMovimentacao = new CriarMovimentacaoPage();
    CriarMovimentacaoDataFuturaPage criarMovimentacaoDataFutura = new CriarMovimentacaoDataFuturaPage();
    @Quando("preencho o campo data movimentaçao com uma data maior que data atual")
    public void preenchoCampos() {
        criarMovimentacao.preencherCampoTipoMovimentacao();
        criarMovimentacao.preencherCampoDataMovimentacao("03/11/2023");
        criarMovimentacao.preencherCampoDataPagamento("15/01/2022");
        criarMovimentacao.preencherCampoDescricao("Seguro");
        criarMovimentacao.preencherInteressado("Tuca");
        criarMovimentacao.preencherCampoValor("1");
        criarMovimentacao.preencherCampoConta();
        criarMovimentacao.preencherCampoSituacao(0);
    }

    @E("clico botao salvar")
    public void clicoBotaoSalvar() {
        criarMovimentacao.clicarBotaoSalvar();
    }

    @Entao("visualizo mensagem: Data da Movimentação deve ser menor ou igual à data atual")
    public void visualizoMensagemDataMovimentacao() {
        criarMovimentacaoDataFutura.visualizarMensagemDataMovimentacao("Data da Movimentação deve ser menor ou igual à data atual");
    }
}
