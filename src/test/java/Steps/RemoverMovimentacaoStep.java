package Steps;

import Pages.AcessoContaPage;
import Pages.RemoverMovimentacaoPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RemoverMovimentacaoStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    RemoverMovimentacaoPage removerMovimentacaoPage = new RemoverMovimentacaoPage();
    @Dado("que estou na tela resumo mensal")
    public void acessoTelaResumoMensal() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
        removerMovimentacaoPage.acessarTelaResumoMensal();
    }

    @Quando("clico no icone de ações de uma movimentação")
    public void clicoIconeAcoes() {
        removerMovimentacaoPage.clicarIconeAcoes();
    }

    @Entao("visualizo mensagem: Movimentação removida com sucesso!")
    public void visualizoMensagemMovimentacaoRemovidaSucesso() {
        removerMovimentacaoPage.visualizarMensagemMovimentacaoRemovidaSucesso("Movimentação removida com sucesso!");
    }
}
