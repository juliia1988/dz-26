package tests;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.FirstPageWithButtons;


public class TextAvailableTest extends BaseTest {

    private final static String TEXT = "You have done a dynamic click";


    @Test
    @Description("The click on Buttons menu item")
    public void testClickOnButtonsToSeeTheText() {
        String text = new FirstPageWithButtons(driver)
                .clickOnButtonstoSeeTheText()
                .getElement(By.cssSelector("#dynamicClickMessage")).getText().toString();

        System.out.println(text);
        Assert.assertEquals(text, TEXT, "Text is incorrect");
    }
}
