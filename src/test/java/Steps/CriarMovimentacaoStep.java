package Steps;

import Pages.AcessoContaPage;
import Pages.CriarMovimentacaoPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CriarMovimentacaoStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    CriarMovimentacaoPage criarMovimentacao = new CriarMovimentacaoPage();

    @Dado("que clico no menu criar movimentacao")
    public void clicoMenuCriarMovimentacao() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
        criarMovimentacao.clicarMenuCriarMovimentacao();
    }

    @Quando("preencher os campos da tela")
    public void preenchoCampos() {
        criarMovimentacao.preencherCampoTipoMovimentacao();
        criarMovimentacao.preencherCampoDataMovimentacao("20/01/2023");
        criarMovimentacao.preencherCampoDataPagamento("30/01/2022");
        criarMovimentacao.preencherCampoDescricao("Seguro casa e carro");
        criarMovimentacao.preencherInteressado("Tuca1");
        criarMovimentacao.preencherCampoValor("1000");
        criarMovimentacao.preencherCampoConta();
        criarMovimentacao.preencherCampoSituacao(0);
    }

    @Quando("clicar botao salvar")
    public void clicoBotaoSalvar() {
        criarMovimentacao.clicarBotaoSalvar();
    }

    @Entao("visualizo mensagem: Movimentação adicionada com sucesso!")
    public void visualizoMensagemSucesso() {
        criarMovimentacao.MensagemSucesso();
    }
}
