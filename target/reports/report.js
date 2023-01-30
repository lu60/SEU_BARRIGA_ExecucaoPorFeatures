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
  "name": "Acessar site inserindo Login de um usuário existente",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@acessarConta"
    }
  ]
});
formatter.step({
  "name": "que estou no site do seu barriga",
  "keyword": "Dado "
});
formatter.match({
  "location": "AcessoContaStep.AcessoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho meu e-mail e senha",
  "keyword": "Quando "
});
formatter.match({
  "location": "AcessoContaStep.PreenchoEmailSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botao para entrar na conta",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoContaStep.ClicoBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a conta com o nome do usuário logado",
  "keyword": "Então "
});
formatter.match({
  "location": "AcessoContaStep.VisualizoConta()"
});
formatter.result({
  "status": "passed"
});
});