package Steps;

import Pages.AlterarContaMesmoNomePage;
import Pages.AlterarContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterarContaMesmoNomeStep extends RunSeuBarriga {
    WebDriver  driver = new ChromeDriver();
    AlterarContaPage alterarContaPage = new AlterarContaPage(driver);
    AlterarContaMesmoNomePage alterarContaMesmoNomePage = new AlterarContaMesmoNomePage(driver);

    @Dado("que quero alterar um nome da lista")
    public void estouNaLista() {
        alterarContaPage.acessarLista();
    }

    @Quando("seleciono um nome que desejo alterar")
    public void selecionoNomeAlterar() {
        alterarContaMesmoNomePage.selecionarMesmoNomeAlterar("Tuca1");
    }

    @E("clico em salvar")
    public void clicoBotaoSalvar() {
        alterarContaPage.clicarBotaoSalvar();
    }

    @Entao("visualizo mensagem: já existe uma conta com esse nome!")
    public void visualizoMensagem(){
        alterarContaMesmoNomePage.visualizarMensagem("Já existe uma conta com esse nome!");
    }
}
