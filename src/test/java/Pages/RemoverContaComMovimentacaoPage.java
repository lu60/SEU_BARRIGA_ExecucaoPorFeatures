package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoverContaComMovimentacaoPage extends RunSeuBarriga {
    WebDriver driver;

    public RemoverContaComMovimentacaoPage(WebDriver driver) {
        this.driver = driver;
    }

    private By iconeExcluir = By.cssSelector("tbody:nth-child(2) tr:nth-child(3) td:nth-child(2) > a:nth-child(2)");
    private By mensagem_Tela = By.xpath("//div[contains(text(),'Conta em uso na movimentações')]");
    public void selecionarIconeExcluirConta() {
        driver.findElement(iconeExcluir).click();
    }

    public void visualizarMensagemContaComMovimentacao(String mensagemTela) {
        boolean mensagem = driver.findElement(mensagem_Tela).getText().contains(mensagemTela);
        Assert.assertTrue(mensagem);
    }
}
