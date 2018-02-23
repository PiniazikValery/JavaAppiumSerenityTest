package UI.PageObjects;

import UI.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenuPage extends BasePage {
    public  MainMenuPage(WebDriver driver){super(driver);}
    @iOSXCUITFindBy(accessibility = "Activity Indicators")
    private WebElement ActivityIndicatorsButton;

    @iOSXCUITFindBy(accessibility = "Alert Controller")
    private WebElement AlertControllerButton;

    @iOSXCUITFindBy(accessibility = "Buttons")
    private WebElement ButtonsButton;

    @iOSXCUITFindBy(accessibility = "Date Picker")
    private WebElement DatePicker;


    public  void ClickActivityIndicatorsButton()
    {
        ActivityIndicatorsButton.click();
    }

    public void ClickAlertControllerButton()
    {
        AlertControllerButton.click();
    }

    public void ClickButtonsButton(){ButtonsButton.click();}

    public void ClickDatePicker(){DatePicker.click();}

    public WebElement getDatePicker() { return DatePicker; }

    public WebElement getButtonsButton(){return ButtonsButton;}

    public WebElement getActivityIndicatorsButton() {
        return ActivityIndicatorsButton;
    }

    public WebElement getAlertControllerButton() {
        return AlertControllerButton;
    }
}
