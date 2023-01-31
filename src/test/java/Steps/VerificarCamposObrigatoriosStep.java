package Steps;

import Pages.AcessoContaPage;
import Pages.VerificarCamposObrigatoriosPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class VerificarCamposObrigatoriosStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    VerificarCamposObrigatoriosPage verificaCampos = new VerificarCamposObrigatoriosPage();
    @Dado("que estou na tela de criar movimentacao")
    public void acessoTelaCriarMovimentacao() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
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
