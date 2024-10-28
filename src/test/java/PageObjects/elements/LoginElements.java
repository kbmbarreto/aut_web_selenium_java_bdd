package PageObjects.elements;

import org.openqa.selenium.By;

public final class LoginElements {
    public static final By USERNAME_FIELD = By.id("user-name");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");

    private LoginElements() {
        throw new UnsupportedOperationException("Classe utilitária não deve ser instanciada");
    }
}
