package Steps;

import Pages.AcessoContaPage;
import Runner.RunSeuBarriga;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AcessoContaStep extends RunSeuBarriga {
    AcessoContaPage acessoContaPage = new AcessoContaPage();

    @Dado("^que estou no site do seu barriga$")
    public void AcessoLogin() {
       acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
    }
    @Quando("^preencho meu e-mail e senha$")
    public void PreenchoEmailSenha() {
    }

    @E("^clico no botao para entrar na conta$")
    public void ClicoBotaoEntrar() {
    }

    @Entao("^visualizo a conta com o nome do usuário logado$")
    public void VisualizoConta() {
        acessoContaPage.VisualizarConta("Bem vindo, Lu!");
    }
}




