package PageObjects.pages;

import org.openqa.selenium.WebDriver;

import PageObjects.elements.LoginElements;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(LoginElements.USERNAME_FIELD).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginElements.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LoginElements.LOGIN_BUTTON).click();
    }
}
