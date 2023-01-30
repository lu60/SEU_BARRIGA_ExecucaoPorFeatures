package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdicionarContaPage extends RunSeuBarriga {

    WebDriver driver;

    public AdicionarContaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By contas_menu = By.xpath("//a[contains(text(),'Contas')]");
    private By adicionar_menu = By.cssSelector("li.dropdown.open > ul > li:nth-child(1) > a");
    //private By adicionar_menu1 = By.xpath("//a[contains(text(),'Adicionar')]");
    private By nomeConta_txt = By.id("nome");
    private By salvar_botao = By.cssSelector(".btn-group > button");
    private By confirmaConta = By.cssSelector("div.alert.alert-success");

    public void AcessarMenuAdicionarContas() {
        WebElement contas = driver.findElement(contas_menu);
        contas.click();

        WebElement adicionar = driver.findElement(adicionar_menu);
        adicionar.click();
    }

    public void PreencherCampoNome(String nomeConta) {
        driver.findElement(nomeConta_txt).sendKeys(nomeConta);
    }

    public void ClicarBotaoSalvar() {
        driver.findElement(salvar_botao).click();
    }

    public void VisualizarNomeAdicionado(String mensagem) {
        boolean confirma = driver.findElement(confirmaConta).getText().contains(mensagem);
        Assert.assertTrue(confirma);
    }
}
