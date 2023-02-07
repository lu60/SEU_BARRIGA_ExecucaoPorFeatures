package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RemoverContaComMovimentacaoPage extends RunSeuBarriga {
    private By iconeExcluir = By.cssSelector("tr:nth-child(1) > td:nth-child(2) > a:nth-child(2) > span");
    private By mensagem_Tela = By.cssSelector("body.body-index:nth-child(2) > div.alert.alert-danger:nth-child(2)");

    public void selecionarIconeExcluirConta() {
        getDriver().findElement(iconeExcluir).click();
    }

    public void visualizarMensagemContaComMovimentacao() {
        String mensagem = getDriver().findElement(mensagem_Tela).getText();
        Assert.assertEquals("Conta em uso na movimentações", mensagem);
    }
}
