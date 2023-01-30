package Pages;

import Runner.RunSeuBarriga;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificarCamposObrigatoriosPage extends RunSeuBarriga {
    
    WebDriver driver;

    public VerificarCamposObrigatoriosPage(WebDriver driver) {
        this.driver = driver;
    }

    private By criarMovimentacao_menu = By.xpath("//a[contains(text(),'Criar Movimentação')]");
    private By salvar_botao = By.cssSelector("div.col-lg-10 > form > div.btn-group > button");
    private By dataMovimento_mensagem = By.cssSelector(":nth-child(2) div.alert.alert-danger:nth-child(2) ul:nth-child(1) > li:nth-child(1)");
    private By dataPag_mensagem = By.xpath("//li[contains(text(),'Data do pagamento é obrigatório')]");
    private By descricao_mensagem = By.xpath("//li[contains(text(),'Descrição é obrigatório')]");
    private By interessado_mensagem = By.xpath("//li[contains(text(),'Interessado é obrigatório')]");
    private By valor_mensagem = By.xpath("//li[contains(text(),'Valor é obrigatório')]");
    private By valorNum_mensagem = By.xpath("//li[contains(text(),'Valor deve ser um número')]");
    public void acessarCriarMovimentacao(){
        driver.findElement(criarMovimentacao_menu).click();
    }
    public void clicarBotaoSalvar() {
        driver.findElement(salvar_botao).click();
    }
    public void visualizarMensagensCampoDataMovimentacao(String dataMovim) {
        boolean verifcacaoMensagemDataMovim = driver.findElement(dataMovimento_mensagem).getText().contains(dataMovim);
        Assert.assertTrue(verifcacaoMensagemDataMovim);
    }
    public void visualizarMensagensCampoDataPag(String dataPag) {
        boolean verifcacaoMensagemDataPag = driver.findElement(dataPag_mensagem).getText().contains(dataPag);
        Assert.assertTrue(verifcacaoMensagemDataPag);
    }
    public void visualizarMensagensCampoDescricao(String descricao) {
        boolean verifcacaoMensagemDescricao = driver.findElement(descricao_mensagem).getText().contains(descricao);
        Assert.assertTrue(verifcacaoMensagemDescricao);
    }
    public void visualizarMensagensCampoInteressado(String interessado) {
        boolean verifcacaoMensagemInteressado = driver.findElement(interessado_mensagem).getText().contains(interessado);
        Assert.assertTrue(verifcacaoMensagemInteressado);
    }
    public void visualizarMensagensCampoValor(String valor) {
        boolean verifcacaoMensagemValor = driver.findElement(valor_mensagem).getText().contains(valor);
        Assert.assertTrue(verifcacaoMensagemValor);
    }
    public void visualizarMensagemCampoNumerico(String valorNum){
        boolean verifcacaoMensagemValorNum = driver.findElement(valorNum_mensagem).getText().contains(valorNum);
        Assert.assertTrue(verifcacaoMensagemValorNum);
    }
}
