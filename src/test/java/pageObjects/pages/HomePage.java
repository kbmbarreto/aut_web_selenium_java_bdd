package pageObjects.pages;

import pageObjects.elements.HomeElements;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean areAllComponentsVisible() {
        return driver.findElement(HomeElements.HOME_TITLE).isDisplayed();
    }
}
