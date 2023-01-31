package Steps;

import Pages.AcessoContaPage;
import Pages.AdicionarContaPage;
import cucumber.api.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdicionarContaStep {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    AdicionarContaPage adiconaConta = new AdicionarContaPage();

    @Dado("clico na opçao adicionar do menu contas")
    public void AcessoAdicionarMenuContas() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
        adiconaConta.AcessarMenuAdicionarContas();
    }

    @Quando("preencho o campo nome")
    public void PreenchoCampoNome() {
        adiconaConta.PreencherCampoNome("Zebra");
    }

    @E("ciclo no botao salvar")
    public void BotaoSalvar() {
        adiconaConta.ClicarBotaoSalvar();
    }

    @Entao("visualizo a mensagem: Conta adicionada com sucesso!")
    public void visualizoAMensagemContaAdicionadaComSucesso() {
        adiconaConta.VisualizarNomeAdicionado("Conta adicionada com sucesso!");
    }
}


