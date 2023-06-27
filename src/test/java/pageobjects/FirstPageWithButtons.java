package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPageWithButtons extends AbstractPageObject{
    private final By clickMeButton = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]");
    private final By leftMenuButtonsButton = By.cssSelector("#item-4");

    public FirstPageWithButtons(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }

    @Step("The user clicks Buttons one by one to see the TEXT")
    public MainPage clickOnButtonstoSeeTheText() {
        clickOnElementWithJS(leftMenuButtonsButton);
        clickOnElementWithJS(clickMeButton);
        return new MainPage(driver);
    }
}