package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarMovimentacaoDataFuturaPage extends RunSeuBarriga {

    WebDriver driver;

    public CriarMovimentacaoDataFuturaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By mensagemTela = By.xpath("//li[contains(text(),'Data da Movimentação deve ser menor ou igual à dat')]");
    public void visualizarMensagemDataMovimentacao(String mensagem){
        boolean visualizaMensagem = driver.findElement(mensagemTela).getText().contains(mensagem);
        Assert.assertTrue(visualizaMensagem);
    }
}
