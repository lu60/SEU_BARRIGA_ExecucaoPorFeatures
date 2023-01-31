$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/ContaSeuBarriga.feature");
formatter.feature({
  "name": "Acessar, adicionar e alterar conta de um usuário no site do SeuBarriga",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@cenarioCompleto"
    }
  ]
});
formatter.scenario({
  "name": "Remover uma conta com movimentação",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@removerContaComMovimentacao"
    }
  ]
});
formatter.step({
  "name": "que estou na lista de contas",
  "keyword": "Dado "
});
formatter.match({
  "location": "RemoverContaComMovimentacaoStep.acessoListaContas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o ícone para excluir um nome da lista que possui movimentação",
  "keyword": "Quando "
});
formatter.match({
  "location": "RemoverContaComMovimentacaoStep.selecionoIconeExcluirConta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo mensagem: Conta em uso na movimentações",
  "keyword": "Então "
});
formatter.match({
  "location": "RemoverContaComMovimentacaoStep.visualizoMensagemContaComMovimentacao()"
});
formatter.result({
  "status": "passed"
});
});