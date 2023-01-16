package Pages;

import Runner.RunSeuBarriga;
import Suporte.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class AlterarContaPage extends RunSeuBarriga {
    private By contas_menu = By.xpath("//a[contains(text(),'Contas')]");
    private By listar_contas = By.xpath("//a[contains(text(),'Listar')]");
    private By nome_lista = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(1)");

    private By iconeAlterar = By.cssSelector("tbody:nth-child(2) tr:nth-child(1) td:nth-child(2) a:nth-child(1) > span.glyphicon.glyphicon-edit");
    private By nomeContaAlterada_txt = By.id("nome");
    private By botaoSalvar = By.cssSelector(".body-index:nth-child(2) div.col-lg-10:nth-child(3) form:nth-child(1) div.btn-group:nth-child(3) > button.btn.btn-primary");
    private By novoNome_lista = By.cssSelector("#tr:nth-child(1) > td:nth-child(1)");

    public void acessarLista(){
        WebElement contas = getDriver().findElement(contas_menu);
        contas.click();

        WebElement adicionar = getDriver().findElement(listar_contas);
        adicionar.click();
    }
    public void selecionarNomeAlterar(String nomeAlterar) {
        String nomeLista = getDriver().findElement(nome_lista).getText();
            //if (nomeLista == escolherNomeLista) {
                getDriver().findElement(iconeAlterar).click();
                getDriver().findElement(nomeContaAlterada_txt).clear();
                getDriver().findElement(nomeContaAlterada_txt).sendKeys(nomeAlterar);
          //  }else{
          //      System.out.println("Não encontrado nome na lista.");
          //  }
    }
    public void clicarBotaoSalvar(){
        getDriver().findElement(botaoSalvar).click();
    }
    public void visualizoListaNomeAlterado() {
        String nomeLista = getDriver().findElement(nome_lista).getText();
        Utils.waitElementBePresent(nome_lista,2000);
        System.out.println(nomeLista);
    }
}
