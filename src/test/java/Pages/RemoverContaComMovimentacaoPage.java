package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RemoverContaComMovimentacaoPage extends RunSeuBarriga {
    private By iconeExcluir = By.cssSelector("tbody:nth-child(2) tr:nth-child(3) td:nth-child(2) > a:nth-child(2)");
    private By mensagem_Tela = By.xpath("//div[contains(text(),'Conta em uso na movimentações')]");

    public void selecionarIconeExcluirConta() {
        getDriver().findElement(iconeExcluir).click();
    }

    public void visualizarMensagemContaComMovimentacao(String mensagemTela) {
        boolean mensagem = getDriver().findElement(mensagem_Tela).getText().contains(mensagemTela);
        Assert.assertTrue(mensagem);
    }
}
