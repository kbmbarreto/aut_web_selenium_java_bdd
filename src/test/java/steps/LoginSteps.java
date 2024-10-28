package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.pages.HomePage;
import pageObjects.pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    private final WebDriver driver = DriverFactory.getDriver("firefox");
    private LoginPage loginPage;
    private HomePage homePage;

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
        // Inicializa homePage após o login bem-sucedido
        homePage = new HomePage(driver);
    }

    @Then("vejo a página de produtos")
    public void vejo_a_pagina_de_produtos() {
        Assert.assertTrue("Nem todos os componentes da página de produtos estão visíveis.", homePage.areAllComponentsVisible());
    }

    @Then("vejo as validações de erro na tela")
    public void vejoAsValidaçõesDeErroNaTela() {
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(expectedErrorMessage, loginPage.getErrorLoginMessage());
    }

    @When("aguardo os componentes carregarem")
    public void aguardoOsComponentesCarregarem() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("vejo todos os componentes carregados na tela")
    public void vejoTodosOsComponentesCarregadosNaTela() {
        Assert.assertTrue("Nem todos os componentes da página de login estão visíveis.", loginPage.areAllComponentsVisible());
    }
}
