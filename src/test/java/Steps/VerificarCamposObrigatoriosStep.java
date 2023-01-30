package Steps;

import Pages.VerificarCamposObrigatoriosPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificarCamposObrigatoriosStep extends RunSeuBarriga {
    WebDriver driver = new ChromeDriver();

    VerificarCamposObrigatoriosPage verificaCampos = new VerificarCamposObrigatoriosPage(driver);
    @Dado("que estou na tela de criar movimentacao")
    public void acessoTelaCriarMovimentacao() {
        verificaCampos.acessarCriarMovimentacao();
    }

    @Quando("ciclo no botao salvar sem preencher os campos obrigatorios")
    public void cicloBotaoSalvarSemPreencherCampos() {
        verificaCampos.clicarBotaoSalvar();
    }

    @Entao("visualizo as mensagens da obrigatoriedade de preenchimento dos campos")
    public void visualizoMensagensObrigatoriedadePreenchimentoCampos() {
        verificaCampos.visualizarMensagensCampoDataMovimentacao("Data da Movimentação é obrigatório");
        verificaCampos.visualizarMensagensCampoDataPag("Data do pagamento é obrigatório");
        verificaCampos.visualizarMensagensCampoDescricao("Descrição é obrigatório");
        verificaCampos.visualizarMensagensCampoInteressado("Interessado é obrigatório");
        verificaCampos.visualizarMensagensCampoValor("Valor é obrigatório");
        verificaCampos.visualizarMensagemCampoNumerico("Valor deve ser um número");
    }
}
