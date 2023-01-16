package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcessoContaPage extends RunSeuBarriga {
    private By email_txt = By.id("email");
    private By senha_txt = By.id("senha");
    private By entrar_botao = By.cssSelector("button");
    private By menssagemBemVindo = By.cssSelector("body.body-index:nth-child(2) > div.alert.alert-success:nth-child(2)");

    public void AcessarConta() {
        getDriver().manage().window().maximize();
        getDriver().get("https://seubarriga.wcaquino.me/logout");
    }

    public void PreencherEmailSenha(String email, String senha) {
        getDriver().findElement(email_txt).click();
        getDriver().findElement(email_txt).sendKeys(email);
        getDriver().findElement(senha_txt).sendKeys(senha);
    }

    public void ClicarBotaoEntrar() {
        getDriver().findElement(entrar_botao).click();
    }

    public void VisualizarConta(String mensagem) {
        String usuario = getDriver().findElement(menssagemBemVindo).getText();
        Assert.assertEquals(mensagem, usuario);
    }
}
