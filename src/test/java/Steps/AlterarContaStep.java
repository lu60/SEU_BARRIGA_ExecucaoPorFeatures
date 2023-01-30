package Steps;

import Pages.AlterarContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterarContaStep extends RunSeuBarriga {
    WebDriver driver = new ChromeDriver();

    AlterarContaPage alterarContaPage = new AlterarContaPage(driver);

    @Dado("que estou na lista")
    public void estouNaLista() {
        alterarContaPage.acessarLista();
    }

    @Quando("seleciono um nome da lista que desejo alterar")
    public void selecionoNomeAlterar() {
        alterarContaPage.selecionarNomeAlterar("Tuca123");
        alterarContaPage.clicarBotaoSalvar();
    }

    @Entao("visualizo a lista com o nome alterado")
    public void visualizoListaNomeAlterado() {
        alterarContaPage.visualizoListaNomeAlterado();
    }
}
