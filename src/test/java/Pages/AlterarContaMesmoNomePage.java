package Pages;

import Runner.RunSeuBarriga;
import Suporte.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlterarContaMesmoNomePage extends RunSeuBarriga {
    WebDriver driver;

    public AlterarContaMesmoNomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By descMensagemTela = By.xpath("//div[contains(text(),'Já existe uma conta com esse nome!')]");
    private By nomeContaAlterada_txt = By.id("nome");
    private By nome_lista = By.cssSelector("#tabelaContas > tbody > tr:nth-child(2) > td:nth-child(1)");
    private By iconeAlterar = By.cssSelector("tbody:nth-child(2) tr:nth-child(1) td:nth-child(2) a:nth-child(1) > span.glyphicon.glyphicon-edit");
    public void selecionarMesmoNomeAlterar(String nomeAlterar) {
        String nomeLista = driver.findElement(nome_lista).getText();
//        if (nomeLista == escolherNomeLista) {
            driver.findElement(iconeAlterar).click();
            driver.findElement(nomeContaAlterada_txt).clear();
            driver.findElement(nomeContaAlterada_txt).sendKeys(nomeAlterar);
 //       }else{
 //           System.out.println("Não encontrado nome na lista.");
//        }
    }
    public void visualizarMensagem(String mensagemTela) {
        boolean mensagem = driver.findElement(descMensagemTela).getText().contains(mensagemTela);
        Assert.assertTrue(mensagem);
    }
}
