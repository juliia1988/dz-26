package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class MainPage extends AbstractPageObject {
    private final By finalText = By.cssSelector("#dynamicClickMessage");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getFinalText() {
        return getElement(finalText).getText();
    }

}