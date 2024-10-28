# new feature
# Tags: optional

Feature: Login

    Scenario: Login com usuario e senha incorretos
        Given que estou na página de login
        When eu insiro o usuário "teste" e a senha "secret_test"
        And clico no botão de login
        Then vejo as validações de erro na tela

    Scenario: Login com sucesso
        Given que estou na página de login
        When eu insiro o usuário "standard_user" e a senha "secret_sauce"
        And clico no botão de login
        Then vejo a página de produtos