package pageObjects.elements;

import org.openqa.selenium.By;

public final class LoginElements {
    public static final By USERNAME_FIELD = By.id("user-name");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_LOGIN_MESSAGE = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");

    public static final By TITLE_ONE = By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/h4");

    private LoginElements() {
        throw new UnsupportedOperationException("Classe utilitária não deve ser instanciada");
    }
}

