package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcessoContaPage extends RunSeuBarriga {
WebDriver driver;

    public AcessoContaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By email_txt = By.id("email");
    private By senha_txt = By.id("senha");
    private By entrar_botao = By.cssSelector("button");
    private By menssagemBemVindo = By.cssSelector("body.body-index:nth-child(2) > div.alert.alert-success:nth-child(2)");

    public void AcessarConta() {
        driver.manage().window().maximize();
        driver.get("https://seubarriga.wcaquino.me/logout");
    }

    public void PreencherEmailSenha(String email, String senha) {
        driver.findElement(email_txt).click();
        driver.findElement(email_txt).sendKeys(email);
        driver.findElement(senha_txt).sendKeys(senha);
    }

    public void ClicarBotaoEntrar() {
        driver.findElement(entrar_botao).click();
    }

    public void VisualizarConta(String mensagem) {
        String usuario = driver.findElement(menssagemBemVindo).getText();
        Assert.assertEquals(mensagem, usuario);
    }
}
