package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditPage extends AbstractPageObject {

    private final By editButton = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper:nth-child(2) div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(1) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span.mr-2:nth-child(1) svg:nth-child(1) > path:nth-child(1)");
    private final By submitButton = By.cssSelector("#submit");
    private final By newfirstName = By.cssSelector("#firstName");
    private final By updatedRow = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]");

    public EditPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }

    @Step("The user clicks Edit icon to open the form and change Name")
    public List<WebElement> getUpdatedRecord() {
        getElement(editButton).click();
        getElement(newfirstName).sendKeys("Olena");
        getElement(submitButton).click();
        return getElements(updatedRow);
    }

    @Step("The user clicks Edit icon to open the form and change Name")
    public List<WebElement> getOldRecord() {
        return getElements(updatedRow);
    }
}
