package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPageWithButtons extends AbstractPageObject{
    private final By clickMeButton = By.cssSelector("#Hkqg9");
    private final By leftMenuButtonsButton = By.cssSelector("#item-4");
    private final By finalText = By.cssSelector("#dynamicClickMessage");

    public FirstPageWithButtons(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements/");
    }

    @Step("The user clicks Buttons one by one to see the TEXT")
    public MainPage clickOnButtonstoSeeTheText() {
        clickOnElementWithJS(leftMenuButtonsButton);
        clickOnElementWithJS(clickMeButton);
        getElement(finalText);
        return new MainPage(driver);
    }
}