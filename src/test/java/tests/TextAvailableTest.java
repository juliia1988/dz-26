package tests;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.FirstPageWithButtons;
import pageobjects.MainPage;


public class TextAvailableTest extends BaseTest{

    private final static String TEXT = "You have done a dynamic click";


    @Test
    @Description("The click on Buttons menu item")
    public void testFirstButton() {
       new FirstPageWithButtons(driver)
               .clickOnButtonstoSeeTheText();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons"
                , "The logIn was not successful");
    }
}