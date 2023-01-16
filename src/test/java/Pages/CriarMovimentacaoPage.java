package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CriarMovimentacaoPage extends RunSeuBarriga {
    private By criarMovimentacao_menu = By.xpath("//a[contains(text(),'Criar Movimentação')]");
    private By tipoMovimentacao_txt = By.id("tipo");
    private By dataMovimentacao_txt = By.id("data_transacao");
    private By dataPagamento_txt = By.id("data_pagamento");
    private By descricao_txt = By.id("descricao");
    private By interessado_txt = By.id("interessado");
    private By valor_txt = By.id("valor");
    private By conta_combo = By.id("conta");
    private By situacaoPago_radio = By.id("status_pago");
    private By situacaoPendente_radio = By.id("status_pendente");
    private By salvar_botao = By.cssSelector("div.col-lg-10 > form > div.btn-group > button");
    private By mensagemSucesso = By.cssSelector(":nth-child(2) > div.alert.alert-success:nth-child(2)");

    public void clicarMenuCriarMovimentacao(){
        WebElement criarMovimentacao = getDriver().findElement(criarMovimentacao_menu);
        criarMovimentacao.click();
    }
    public void preencherCampoTipoMovimentacao(){
        Select tipo = new Select(getDriver().findElement(tipoMovimentacao_txt));
        tipo.selectByValue("DESP");
    }
    public void preencherCampoDataMovimentacao(String dataMov) {
        getDriver().findElement(dataMovimentacao_txt).sendKeys(dataMov);
    }
    public void preencherCampoDataPagamento(String dataPag) {
        getDriver().findElement(dataPagamento_txt).sendKeys(dataPag);
    }
    public void preencherCampoDescricao(String descricao) {
        getDriver().findElement(descricao_txt).sendKeys(descricao);
    }
    public void preencherInteressado(String interessado) {
        getDriver().findElement(interessado_txt).sendKeys(interessado);
    }
    public void preencherCampoValor(String valor) {
        getDriver().findElement(valor_txt).sendKeys(valor);

    }
    public void preencherCampoConta() {
        Select conta = new Select(getDriver().findElement(conta_combo));
        conta.selectByValue("1550229");
    }
    public void preencherCampoSituacao(Integer valor) {
        if (valor == 0) {
            getDriver().findElement(situacaoPendente_radio).click();
        }if (valor == 1){
            getDriver().findElement(situacaoPago_radio).click();
        }
    }
    public void clicarBotaoSalvar() {
        getDriver().findElement(salvar_botao).click();
    }
    public void MensagemSucesso(){
        getDriver().findElement(mensagemSucesso).getText();
        Assert.assertTrue("Movimentação adicionada com sucesso!",true);
    }

}
