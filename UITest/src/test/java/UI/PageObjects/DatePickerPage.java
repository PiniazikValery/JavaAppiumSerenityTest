package UI.PageObjects;

import UI.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage extends BasePage{
    public DatePickerPage(WebDriver driver)
    {
        super(driver);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")
    private WebElement backButton;

    @iOSXCUITFindBy(xpath = "(//*[@type=\"XCUIElementTypePickerWheel\"])[1]")
    private WebElement Day;

    @iOSXCUITFindBy(xpath = "(//*[@type=\"XCUIElementTypePickerWheel\"])[2]")
    private WebElement Hour;

    @iOSXCUITFindBy(xpath = "(//*[@type=\"XCUIElementTypePickerWheel\"])[3]")
    private WebElement Minute;

    @iOSXCUITFindBy(xpath = "(//*[@type=\"XCUIElementTypePickerWheel\"])[4]")
    private WebElement PMAM;


    public void SetDay(String day)
    {
        Day.sendKeys(day);
    }

    public void SetHour(String hour)
    {
        Hour.sendKeys(hour);
    }

    public void SetMinute(String minute)
    {
        Minute.sendKeys(minute);
    }

    public void SetPMAM(String pmam)
    {
        PMAM.sendKeys(pmam);
    }

    public void ClickBackButton()
    {
        backButton.click();
    }
}
