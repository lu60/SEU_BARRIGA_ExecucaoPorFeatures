package Steps;

import Pages.ObterSaldoContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ObterSaldoContaStep extends RunSeuBarriga {
    ObterSaldoContaPage obterSaldo = new ObterSaldoContaPage();
    @Dado("que acesso o menu home")
    public void acessoMenuHome() {
        obterSaldo.acessarMenuHome();
    }

    @Quando("visualizo lista de contas e seus respectivos saldos")
    public void visualizoListaContas_Saldo() {
        obterSaldo.confirmarListaContas_Saldo();
    }

    @Entao("seleciono e apresento uma das conta e seu respectivo saldo")
    public void selecionoConta_Saldo() {
        obterSaldo.selecionarConta_Saldo("Tuca1");
    }
}
