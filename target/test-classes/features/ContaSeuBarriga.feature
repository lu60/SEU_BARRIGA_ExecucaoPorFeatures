#language:pt
@cenarioCompleto
Funcionalidade: Acessar, adicionar e alterar conta de um usuário no site do SeuBarriga

  @1-acessarConta
  Cenário: Acessar site inserindo Login de um usuário existente
    Dado que estou no site do seu barriga
    Quando preencho meu e-mail e senha
    E clico no botao para entrar na conta
    Então visualizo a conta com o nome do usuário logado

  @2-alterarConta
  Cenário: Alterar nome conta do usuario logado
    Dado que estou na lista
    Quando seleciono um nome da lista que desejo alterar
    Então visualizo a lista com o nome alterado

  @3-alterarContaMesmoNome
  Cenario: Alterar nome conta inserindo um nome já existente
    Dado que quero alterar um nome da lista
    Quando seleciono um nome que desejo alterar
    E clico em salvar
    Entao visualizo mensagem: já existe uma conta com esse nome!

  @4-adicionarConta
  Cenário: Adicionar nova conta para o usuario logado
    Dado clico na opçao adicionar do menu contas
    Quando preencho o campo nome
    E ciclo no botao salvar
    Então visualizo a mensagem: Conta adicionada com sucesso!

  @5-criarMovimentacao
  Cenario: Inserir uma movimentação na conta
    Dado que clico no menu criar movimentacao
    Quando preencher os campos da tela
    E clicar botao salvar
    Entao visualizo mensagem: Movimentação adicionada com sucesso!

  @6-camposObrigatorios
  Cenario: Validar mensagens dos campos obrigatórios ao criar uma movimentação
    Dado que estou na tela de criar movimentacao
    Quando ciclo no botao salvar sem preencher os campos obrigatorios
    Entao visualizo as mensagens da obrigatoriedade de preenchimento dos campos

  @7-criarMovimentacaoFutura
  Cenario: Inserir uma movimentação na conta com data futura
    Dado que clico no menu criar movimentacao
    Quando preencho o campo data movimentaçao com uma data maior que data atual
    E clico botao salvar
    Entao visualizo mensagem: Data da Movimentação deve ser menor ou igual à data atual

  @8-removerContaComMovimentacao
  Cenario: Remover uma conta com movimentação
    Dado que estou na lista de contas
    Quando seleciono o ícone para excluir um nome da lista que possui movimentação
    Então visualizo mensagem: Conta em uso na movimentações

  @9-removerMovimentacao
  Cenario: Remover uma movimentação da conta
    Dado que estou na tela resumo mensal
    Quando clico no icone de ações de uma movimentação
    Entao visualizo mensagem: Movimentação removida com sucesso!

  @10-obterSaldoConta
  Cenario: Visualizar saldo de uma conta com movimentação
    Dado que acesso o menu home
    Quando visualizo lista de contas e seus respectivos saldos
    Entao seleciono e apresento uma das conta e seu respectivo saldo
