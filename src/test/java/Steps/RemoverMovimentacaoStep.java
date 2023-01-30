package Steps;

import Pages.RemoverMovimentacaoPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoverMovimentacaoStep extends RunSeuBarriga {
    WebDriver driver = new ChromeDriver();
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
        removerMovimentacaoPage.visualizarMensagemMovimentacaoRemovidaSucesso("Movimentação removida com sucesso!");
    }
}
