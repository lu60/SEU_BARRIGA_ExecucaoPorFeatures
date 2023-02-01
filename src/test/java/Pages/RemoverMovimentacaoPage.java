package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RemoverMovimentacaoPage extends RunSeuBarriga {
    private By resumoMensal_menu = By.xpath("//a[contains(text(),'Resumo Mensal')]");
    private By mes = By.id("mes");
    private By ano = By.id("ano");
    private By botaoBuscar = By.cssSelector("div.form-group.col-lg-9 > form > input");
    private By iconeAcoes = By.cssSelector("tr:nth-child(1) > td:nth-child(6) > a > span");
    private By mensagemTela = By.xpath("//div[contains(text(),'Movimentação removida com sucesso!')]");
    public void acessarTelaResumoMensal() {
        getDriver().findElement(resumoMensal_menu).click();

        //Seleciona Mês na combo
        WebElement elementoMes = getDriver().findElement(mes);
        Select comboMes = new Select(elementoMes);
        comboMes.selectByVisibleText("Dezembro");

        //Seleciona Ano na combo
        WebElement elementoAno = getDriver().findElement(ano);
        Select comboAno = new Select(elementoAno);
        comboAno.selectByValue("2022");

        getDriver().findElement(botaoBuscar).click();
    }

    public void clicarIconeAcoes() {
        getDriver().findElement(iconeAcoes).click();
    }

    public void visualizarMensagemMovimentacaoRemovidaSucesso(String mensagem) {
        boolean mensagemRemovida = getDriver().findElement(mensagemTela).getText().contains(mensagem);
        Assert.assertTrue(mensagemRemovida);
    }
}
