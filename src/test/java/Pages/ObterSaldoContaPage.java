package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ObterSaldoContaPage extends RunSeuBarriga {
    private By tabela = By.id("tabelaSaldo");
    private By saldo = By.cssSelector("#tabelaSaldo > tbody > tr:nth-child(2) > td:nth-child(2)");

    public void confirmarListaContas_Saldo() {
        String nomeConta = getDriver().findElement(tabela).getText();
        System.out.println(nomeConta);
    }

    public void selecionarConta_Saldo(String nome){
        String tabelaSaldo = getDriver().findElement(saldo).getText();
        System.out.println("\nCONTA SELECIONADA:\n" + nome + "  " + tabelaSaldo);
    }
}
