package Pages;

import Runner.RunSeuBarriga;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ObterSaldoContaPage extends RunSeuBarriga {
    private By home_menu = By.xpath("//a[contains(text(),'Home')]");
    private By tabela = By.cssSelector("body > div");
    private By saldo = By.cssSelector("tbody > tr:nth-child(1) > td:nth-child(2)");

    public void acessarMenuHome() {
        WebElement home = getDriver().findElement(home_menu);
        home.click();
    }
    public void confirmarListaContas_Saldo() {
        String nomeConta = getDriver().findElement(tabela).getText();
        System.out.println(nomeConta);
    }

    public void selecionarConta_Saldo(String nome){
        String tabelaSaldo = getDriver().findElement(saldo).getText();
        System.out.println("Cenário 10: " + "\nCONTA SELECIONADA:\n" + nome + "    " + "Saldo =  " + tabelaSaldo);
    }
}
