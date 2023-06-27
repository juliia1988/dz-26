package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class FormPage extends AbstractPageObject {

    private final By row = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper:nth-child(2) div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody > div.rt-tr-group:nth-child(4)");


    public FormPage(WebDriver driver) {
        super(driver);
    }


    public List<WebElement> getLinkTitleElements() {
        return getElements(row);
    }
}