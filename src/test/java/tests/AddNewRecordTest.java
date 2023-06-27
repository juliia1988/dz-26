package tests;

import com.google.common.collect.Comparators;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.SecondPageWithForm;

import java.util.Comparator;
import java.util.List;

public class AddNewRecordTest extends BaseTest{

    @Test
    @Description("Add new records")
    public void testAddNewRecord() {

        List<WebElement> rowElements = new SecondPageWithForm(driver)
                .fillTheForm()
                .getLinkTitleElements();

        List<String> rowElementsToLines = rowElements.stream().map(WebElement::getText).toList();

        boolean isNewRecordExist = rowElements.isEmpty();

        System.out.println(rowElementsToLines);
        Assert.assertFalse(isNewRecordExist, "The items were not added");
    }

}
