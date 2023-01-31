package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AlterarContaMesmoNomePage extends RunSeuBarriga {

    private By descMensagemTela = By.xpath("//div[contains(text(),'Já existe uma conta com esse nome!')]");
    private By nomeContaAlterada_txt = By.id("nome");
    private By nome_lista = By.cssSelector("#tabelaContas > tbody > tr:nth-child(2) > td:nth-child(1)");
    private By iconeAlterar = By.cssSelector("tbody:nth-child(2) tr:nth-child(1) td:nth-child(2) a:nth-child(1) > span.glyphicon.glyphicon-edit");
    public void selecionarMesmoNomeAlterar(String nomeAlterar) {
        String nomeLista = getDriver().findElement(nome_lista).getText();
//        if (nomeLista == escolherNomeLista) {
        getDriver().findElement(iconeAlterar).click();
        getDriver().findElement(nomeContaAlterada_txt).clear();
        getDriver().findElement(nomeContaAlterada_txt).sendKeys(nomeAlterar);
        //       }else{
        //           System.out.println("Não encontrado nome na lista.");
//        }
    }
    public void visualizarMensagem(String mensagemTela) {
        boolean mensagem = getDriver().findElement(descMensagemTela).getText().contains(mensagemTela);
        Assert.assertTrue(mensagem);
    }
}
