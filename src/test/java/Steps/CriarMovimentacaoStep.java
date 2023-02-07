package Steps;

import Pages.CriarMovimentacaoPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CriarMovimentacaoStep extends RunSeuBarriga {
    CriarMovimentacaoPage criarMovimentacao = new CriarMovimentacaoPage();

    @Dado("que clico no menu criar movimentacao")
    public void clicoMenuCriarMovimentacao() {
        criarMovimentacao.clicarMenuCriarMovimentacao();
    }

    @Quando("preencher os campos da tela")
    public void preenchoCampos() {
        criarMovimentacao.preencherCampoTipoMovimentacao();
        criarMovimentacao.preencherCampoDataMovimentacao("20/12/2022");
        criarMovimentacao.preencherCampoDataPagamento("20/12/2022");
        criarMovimentacao.preencherCampoDescricao("Seguro casa e carro");
        criarMovimentacao.preencherInteressado("Tuca1");
        criarMovimentacao.preencherCampoValor("1001");
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
        System.out.println("Cenário 5: Movimentação adicionada com sucesso!");
    }
}
