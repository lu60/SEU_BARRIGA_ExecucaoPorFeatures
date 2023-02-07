package Steps;

import Pages.AlterarContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.*;

public class AlterarContaStep extends RunSeuBarriga {
    AlterarContaPage alterarContaPage = new AlterarContaPage();

    @Dado("que estou na lista")
    public void estouNaLista() {
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
        System.out.println("Cenário 2: Nome alterado para Tuca1234");
    }
}
