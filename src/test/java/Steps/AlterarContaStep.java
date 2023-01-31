package Steps;

import Pages.AcessoContaPage;
import Pages.AlterarContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.*;

public class AlterarContaStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    AlterarContaPage alterarContaPage = new AlterarContaPage();

    @Dado("que estou na lista")
    public void estouNaLista() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
        alterarContaPage.acessarLista();
    }

    @Quando("seleciono um nome da lista que desejo alterar")
    public void selecionoNomeAlterar() {
        alterarContaPage.selecionarNomeAlterar("Tuca1234");
        alterarContaPage.clicarBotaoSalvar();
    }

    @Entao("visualizo a lista com o nome alterado")
    public void visualizoListaNomeAlterado() {
        alterarContaPage.visualizoListaNomeAlterado();
    }
}
