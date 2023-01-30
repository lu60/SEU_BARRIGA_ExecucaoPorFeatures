package Steps;

import Pages.AcessoContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessoContaStep extends RunSeuBarriga {

    WebDriver driver = new ChromeDriver();
    AcessoContaPage acessoContaPage = new AcessoContaPage(driver);

    @Dado("^que estou no site do seu barriga$")
    public void AcessoLogin() {
       acessoContaPage.AcessarConta();
    }
    @Quando("^preencho meu e-mail e senha$")
    public void PreenchoEmailSenha() {
        acessoContaPage.PreencherEmailSenha("lu.pocebon@gmail.com", "P@alito176");
    }

    @E("^clico no botao para entrar na conta$")
    public void ClicoBotaoEntrar() {
        acessoContaPage.ClicarBotaoEntrar();
    }

    @Entao("^visualizo a conta com o nome do usuário logado$")
    public void VisualizoConta() {
        acessoContaPage.VisualizarConta("Bem vindo, Lu!");
    }
}




