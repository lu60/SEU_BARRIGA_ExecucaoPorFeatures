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
      "name": "@1-acessarConta"
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
formatter.scenario({
  "name": "Alterar nome conta do usuario logado",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@2-alterarConta"
    }
  ]
});
formatter.step({
  "name": "que estou na lista",
  "keyword": "Dado "
});
formatter.match({
  "location": "AlterarContaStep.estouNaLista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono um nome da lista que desejo alterar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlterarContaStep.selecionoNomeAlterar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a lista com o nome alterado",
  "keyword": "Então "
});
formatter.match({
  "location": "AlterarContaStep.visualizoListaNomeAlterado()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Alterar nome conta inserindo um nome já existente",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@3-alterarContaMesmoNome"
    }
  ]
});
formatter.step({
  "name": "que quero alterar um nome da lista",
  "keyword": "Dado "
});
formatter.match({
  "location": "AlterarContaMesmoNomeStep.estouNaLista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono um nome que desejo alterar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlterarContaMesmoNomeStep.selecionoNomeAlterar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em salvar",
  "keyword": "E "
});
formatter.match({
  "location": "AlterarContaMesmoNomeStep.clicoBotaoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo mensagem: já existe uma conta com esse nome!",
  "keyword": "Entao "
});
formatter.match({
  "location": "AlterarContaMesmoNomeStep.visualizoMensagem()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adicionar nova conta para o usuario logado",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@4-adicionarConta"
    }
  ]
});
formatter.step({
  "name": "clico na opçao adicionar do menu contas",
  "keyword": "Dado "
});
formatter.match({
  "location": "AdicionarContaStep.AcessoAdicionarMenuContas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo nome",
  "keyword": "Quando "
});
formatter.match({
  "location": "AdicionarContaStep.PreenchoCampoNome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ciclo no botao salvar",
  "keyword": "E "
});
formatter.match({
  "location": "AdicionarContaStep.BotaoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a mensagem: Conta adicionada com sucesso!",
  "keyword": "Então "
});
formatter.match({
  "location": "AdicionarContaStep.visualizoAMensagemContaAdicionadaComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Inserir uma movimentação na conta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@5-criarMovimentacao"
    }
  ]
});
formatter.step({
  "name": "que clico no menu criar movimentacao",
  "keyword": "Dado "
});
formatter.match({
  "location": "CriarMovimentacaoStep.clicoMenuCriarMovimentacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher os campos da tela",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarMovimentacaoStep.preenchoCampos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar botao salvar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarMovimentacaoStep.clicoBotaoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo mensagem: Movimentação adicionada com sucesso!",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarMovimentacaoStep.visualizoMensagemSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar mensagens dos campos obrigatórios ao criar uma movimentação",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@6-camposObrigatorios"
    }
  ]
});
formatter.step({
  "name": "que estou na tela de criar movimentacao",
  "keyword": "Dado "
});
formatter.match({
  "location": "VerificarCamposObrigatoriosStep.acessoTelaCriarMovimentacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ciclo no botao salvar sem preencher os campos obrigatorios",
  "keyword": "Quando "
});
formatter.match({
  "location": "VerificarCamposObrigatoriosStep.cicloBotaoSalvarSemPreencherCampos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo as mensagens da obrigatoriedade de preenchimento dos campos",
  "keyword": "Entao "
});
formatter.match({
  "location": "VerificarCamposObrigatoriosStep.visualizoMensagensObrigatoriedadePreenchimentoCampos()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Inserir uma movimentação na conta com data futura",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@7-criarMovimentacaoFutura"
    }
  ]
});
formatter.step({
  "name": "que clico no menu criar movimentacao",
  "keyword": "Dado "
});
formatter.match({
  "location": "CriarMovimentacaoStep.clicoMenuCriarMovimentacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo data movimentaçao com uma data maior que data atual",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarMovimentacaoDataFuturaStep.preenchoCampos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico botao salvar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarMovimentacaoDataFuturaStep.clicoBotaoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo mensagem: Data da Movimentação deve ser menor ou igual à data atual",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarMovimentacaoDataFuturaStep.visualizoMensagemDataMovimentacao()"
});
formatter.result({
  "status": "passed"
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
      "name": "@8-removerContaComMovimentacao"
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
formatter.scenario({
  "name": "Remover uma movimentação da conta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@9-removerMovimentacao"
    }
  ]
});
formatter.step({
  "name": "que estou na tela resumo mensal",
  "keyword": "Dado "
});
formatter.match({
  "location": "RemoverMovimentacaoStep.acessoTelaResumoMensal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no icone de ações de uma movimentação",
  "keyword": "Quando "
});
formatter.match({
  "location": "RemoverMovimentacaoStep.clicoIconeAcoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo mensagem: Movimentação removida com sucesso!",
  "keyword": "Entao "
});
formatter.match({
  "location": "RemoverMovimentacaoStep.visualizoMensagemMovimentacaoRemovidaSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Visualizar saldo de uma conta com movimentação",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@10-obterSaldoConta"
    }
  ]
});
formatter.step({
  "name": "que acesso o menu home",
  "keyword": "Dado "
});
formatter.match({
  "location": "ObterSaldoContaStep.acessoMenuHome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo lista de contas e seus respectivos saldos",
  "keyword": "Quando "
});
formatter.match({
  "location": "ObterSaldoContaStep.visualizoListaContas_Saldo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono e apresento uma das conta e seu respectivo saldo",
  "keyword": "Entao "
});
formatter.match({
  "location": "ObterSaldoContaStep.selecionoConta_Saldo()"
});
formatter.result({
  "status": "passed"
});
});