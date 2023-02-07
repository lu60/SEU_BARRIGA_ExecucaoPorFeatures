package Steps;

import Pages.AdicionarContaPage;
import Runner.RunBase;
import cucumber.api.java.pt.*;

public class AdicionarContaStep {
    AdicionarContaPage adiconaConta = new AdicionarContaPage();

    @Dado("clico na opçao adicionar do menu contas")
    public void AcessoAdicionarMenuContas() {
        adiconaConta.AcessarMenuAdicionarContas();
    }

    @Quando("preencho o campo nome")
    public void PreenchoCampoNome() {
        adiconaConta.PreencherCampoNome(RunBase.NomeContaAdicionada);
    }

    @E("ciclo no botao salvar")
    public void BotaoSalvar() {
        adiconaConta.ClicarBotaoSalvar();
    }

    @Entao("visualizo a mensagem: Conta adicionada com sucesso!")
    public void visualizoAMensagemContaAdicionadaComSucesso() {
        adiconaConta.VisualizarNomeAdicionado("Conta adicionada com sucesso!");
        System.out.println("Cenário 4: Conta adicionada com sucesso!");
    }
}


