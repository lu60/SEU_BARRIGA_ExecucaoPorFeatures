package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RemoverMovimentacaoPage extends RunSeuBarriga {
    private By resumoMensal_menu = By.xpath("//a[contains(text(),'Resumo Mensal')]");
    private By iconeAcoes = By.cssSelector("tbody:nth-child(2) tr:nth-child(1) td:nth-child(6) > a:nth-child(1)");
    private By mensagemTela = By.xpath("//div[contains(text(),'Movimentação removida com sucesso!')]");
    public void acessarTelaResumoMensal() {
        driver.findElement(resumoMensal_menu).click();
    }

    public void clicarIconeAcoes() {
        driver.findElement(iconeAcoes).click();
    }

    public void visualizarMensagemMovimentacaoRemovidaSucesso(String mensagem) {
        boolean mensagemRemovida = driver.findElement(mensagemTela).getText().contains(mensagem);
        Assert.assertTrue(mensagemRemovida);
    }
}
