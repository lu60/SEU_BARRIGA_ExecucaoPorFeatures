package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CriarMovimentacaoDataFuturaPage extends RunSeuBarriga {

    private By mensagemTela = By.xpath("//li[contains(text(),'Data da Movimentação deve ser menor ou igual à dat')]");
    public void visualizarMensagemDataMovimentacao(String mensagem){
        boolean visualizaMensagem = getDriver().findElement(mensagemTela).getText().contains(mensagem);
        Assert.assertTrue(visualizaMensagem);
    }
}
