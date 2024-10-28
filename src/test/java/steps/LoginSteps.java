package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private LoginPage loginPage;

    @Given("que estou na página de login")
    public void que_estou_na_pagina_de_login() {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("eu insiro o usuário {string} e a senha {string}")
    public void eu_insiro_o_usuario_e_a_senha(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clico no botão de login")
    public void clico_no_botao_de_login() {
        loginPage.clickLoginButton();
    }

    @Then("vejo a página de produtos")
    public void vejo_a_pagina_de_produtos() {
        // Validação para verificar se o login foi bem-sucedido
    }
}
