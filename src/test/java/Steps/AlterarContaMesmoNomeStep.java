package Steps;

import Pages.AcessoContaPage;
import Pages.AlterarContaMesmoNomePage;
import Pages.AlterarContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AlterarContaMesmoNomeStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    AlterarContaPage alterarContaPage = new AlterarContaPage();
    AlterarContaMesmoNomePage alterarContaMesmoNomePage = new AlterarContaMesmoNomePage();

    @Dado("que quero alterar um nome da lista")
    public void estouNaLista() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
        alterarContaPage.acessarLista();
    }

    @Quando("seleciono um nome que desejo alterar")
    public void selecionoNomeAlterar() {
        alterarContaMesmoNomePage.selecionarMesmoNomeAlterar("Tuca1");
    }

    @E("clico em salvar")
    public void clicoBotaoSalvar() {
        alterarContaPage.clicarBotaoSalvar();
    }

    @Entao("visualizo mensagem: já existe uma conta com esse nome!")
    public void visualizoMensagem(){
        alterarContaMesmoNomePage.visualizarMensagem("Já existe uma conta com esse nome!");
    }
}
