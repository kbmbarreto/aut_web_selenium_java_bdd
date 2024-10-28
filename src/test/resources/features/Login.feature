# new feature
# Tags: optional

Feature: Login

    Scenario: Todos os componentes devem estar presentes na tela de login
        Given que estou na página de login
        When aguardo os componentes carregarem
        Then vejo todos os componentes carregados na tela

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