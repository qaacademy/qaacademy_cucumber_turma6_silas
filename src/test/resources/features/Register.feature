#language:pt
  @Register
  Funcionalidade: Como usuario do site Register
    Eu desejo realizar um cadastro
  Para validar se foi cadastrado com sucesso

  @test001
  Cenario: Validar cadastro com sucesso no site Register
    Dado que eu acesso o site Register
    Quando preencho nome "Silas" e sobrenome "Leão"
    E preencho o campo Endereco com valor "Rua tal"
    E preencho o email com valor "silas.souza@adf.com.br"
    E preencho o telefone com o valor "1112345678"
    E clico no checkbox Male, clico no checkbox Movies
    E seleciono a Skills "Java"
    E seleciono um country
    E seleciono o ano "1989", o mes "May", e o dia "22"





