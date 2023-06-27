package pageobjects;

        import io.qameta.allure.Step;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class SecondPageWithForm extends AbstractPageObject{
    private final By addButton = By.cssSelector("#addNewRecordButton");
    private final By submitButton = By.cssSelector("#submit");
    private final By firstName = By.cssSelector("#firstName");
    private final By lastName = By.cssSelector("#lastName");
    private final By userEmail = By.cssSelector("#userEmail");
    private final By age = By.cssSelector("#age");
    private final By salary = By.cssSelector("#salary");
    private final By department = By.cssSelector("#department");

    public SecondPageWithForm(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }

    @Step("The user clicks Add to open the FORM")
    public FormPage fillTheForm() {
        getElement(addButton).click();
        getElement(firstName).sendKeys("Yuliia");
        getElement(lastName).sendKeys("Sokolova");
        getElement(userEmail).sendKeys("ysokolova1988@gmail.com");
        getElement(age).sendKeys("34");
        getElement(salary).sendKeys("5000");
        getElement(department).sendKeys("QA");
        getElement(submitButton).click();
        return new FormPage(driver);
    }
}