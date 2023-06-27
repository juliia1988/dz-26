package tests;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.EditPage;
import java.util.List;

public class EditRecordTest extends BaseTest{

    @Test
    @Description("Edit the record")
    public void testEditTheRecord() {

        List<WebElement> updatedElements = new EditPage(driver)
                .getUpdatedRecord();

        List<String> updatedElementsToLines = updatedElements.stream().map(WebElement::getText).toList();

        List<WebElement> oldElements = new EditPage(driver)
                .getOldRecord();

        List<String> oldElementsToList = oldElements.stream().map(WebElement::getText).toList();

        boolean isNewRecordUpdated = updatedElementsToLines.equals(oldElementsToList);

        System.out.println(updatedElementsToLines);
        System.out.println(oldElementsToList);
        Assert.assertFalse(isNewRecordUpdated, "The items was not updated");
    }
}
