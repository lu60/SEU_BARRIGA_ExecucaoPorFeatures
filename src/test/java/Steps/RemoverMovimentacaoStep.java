package Steps;

import Pages.RemoverMovimentacaoPage;
import Runner.RunSeuBarriga;
import Suporte.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.util.concurrent.TimeUnit;

public class RemoverMovimentacaoStep extends RunSeuBarriga {
    RemoverMovimentacaoPage removerMovimentacaoPage = new RemoverMovimentacaoPage();
    @Dado("que estou na tela resumo mensal")
    public void acessoTelaResumoMensal() {
        removerMovimentacaoPage.acessarTelaResumoMensal();
    }

    @Quando("clico no icone de ações de uma movimentação")
    public void clicoIconeAcoes() {
        removerMovimentacaoPage.clicarIconeAcoes();
    }

    @Entao("visualizo mensagem: Movimentação removida com sucesso!")
    public void visualizoMensagemMovimentacaoRemovidaSucesso() {
        removerMovimentacaoPage.visualizarMensagemMovimentacaoRemovidaSucesso();
        System.out.println("Cenário 9: Movimentação removida com sucesso!");
    }
}
