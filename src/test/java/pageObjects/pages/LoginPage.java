package pageObjects.pages;

import org.openqa.selenium.WebDriver;

import pageObjects.elements.LoginElements;

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

    public String getErrorLoginMessage() {
        return driver.findElement(LoginElements.ERROR_LOGIN_MESSAGE).getText();
    }

    public boolean areAllComponentsVisible() {
        return driver.findElement(LoginElements.USERNAME_FIELD).isDisplayed() &&
                driver.findElement(LoginElements.PASSWORD_FIELD).isDisplayed() &&
                driver.findElement(LoginElements.LOGIN_BUTTON).isDisplayed() &&
                driver.findElement(LoginElements.TITLE_ONE).isDisplayed();
    }
}
