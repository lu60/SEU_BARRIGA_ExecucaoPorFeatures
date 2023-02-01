package Steps;

import Pages.AcessoContaPage;
import Pages.ObterSaldoContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ObterSaldoContaStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    ObterSaldoContaPage obterSaldo = new ObterSaldoContaPage();
    @Dado("que acesso o menu home")
    public void acessoMenuHome() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
    }

    @Quando("visualizo lista de contas e seus respectivos saldos")
    public void visualizoListaContas_Saldo() {
        obterSaldo.confirmarListaContas_Saldo();

    }

    @Entao("seleciono e apresento uma das conta e seu respectivo saldo")
    public void selecionoConta_Saldo() {
        obterSaldo.selecionarConta_Saldo("Tuca 1");
    }
}
