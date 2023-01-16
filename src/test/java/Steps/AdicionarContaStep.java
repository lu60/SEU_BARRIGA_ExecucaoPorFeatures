package Steps;

import Pages.AcessoContaPage;
import Pages.AdicionarContaPage;
import cucumber.api.java.pt.*;

public class AdicionarContaStep {
    AdicionarContaPage adiconaConta = new AdicionarContaPage();

    @Dado("clico na opçao adicionar do menu contas")
    public void AcessoAdicionarMenuContas() {
        adiconaConta.AcessarMenuAdicionarContas();
    }

    @Quando("preencho o campo nome")
    public void PreenchoCampoNome() {
        adiconaConta.PreencherCampoNome("Zebra");
    }

    @E("ciclo no botao salvar")
    public void BotaoSalvar() {
        adiconaConta.ClicarBotaoSalvar();
    }

    @Entao("visualizo a mensagem: Conta adicionada com sucesso!")
    public void visualizoAMensagemContaAdicionadaComSucesso() {
        adiconaConta.VisualizarNomeAdicionado("Conta adicionada com sucesso!");
    }
}


