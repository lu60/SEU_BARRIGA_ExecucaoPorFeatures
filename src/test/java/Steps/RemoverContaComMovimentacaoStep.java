package Steps;

import Pages.AcessoContaPage;
import Pages.AlterarContaPage;
import Pages.RemoverContaComMovimentacaoPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RemoverContaComMovimentacaoStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();
    AlterarContaPage alterarContaPage = new AlterarContaPage();
    RemoverContaComMovimentacaoPage removerContaComMovimentacaoPage = new RemoverContaComMovimentacaoPage();
    @Dado("que estou na lista de contas")
    public void acessoListaContas() {
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
        alterarContaPage.acessarLista();
    }

    @Quando("seleciono o ícone para excluir um nome da lista que possui movimentação")
    public void selecionoIconeExcluirConta() {
        removerContaComMovimentacaoPage.selecionarIconeExcluirConta();
    }

    @Entao("visualizo mensagem: Conta em uso na movimentações")
    public void visualizoMensagemContaComMovimentacao() {
        removerContaComMovimentacaoPage.visualizarMensagemContaComMovimentacao("Conta em uso na movimentações");
    }
}
