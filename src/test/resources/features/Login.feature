# new feature
# Tags: optional

Feature: Login

    Scenario: Login com sucesso
        Given que estou na página de login
        When eu insiro o usuário "standard_user" e a senha "secret_sauce"
        And clico no botão de login
        Then vejo a página de produtos
