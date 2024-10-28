package pageObjects.elements;

import org.openqa.selenium.By;

public final class HomeElements {

    public static final By HOME_TITLE = By.xpath("//div[contains(@class,'app_logo')]");

    private HomeElements() {
        throw new UnsupportedOperationException("Classe utilitária não deve ser instanciada");
    }
}
