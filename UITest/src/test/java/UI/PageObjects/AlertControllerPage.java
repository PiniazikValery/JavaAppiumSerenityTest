package UI.PageObjects;

import UI.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertControllerPage extends BasePage {
    WebDriverWait wait;
    public AlertControllerPage(WebDriver driver) {
        super(driver);
        wait=new WebDriverWait(driver, 300);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")
    private WebElement backButton;

    @iOSXCUITFindBy(accessibility = "Simple")
    private WebElement SimpleAlertButton;

    @iOSXCUITFindBy(xpath = "(//*[@name=\"Okay / Cancel\"])[1]")
    private WebElement FirstOkayCancelAlertButton;

    @iOSXCUITFindBy(xpath = "(//*[@name=\"Other\"])[1]")
    private WebElement FirstOtherAlertButton;

    @iOSXCUITFindBy(accessibility = "Text Entry")
    private WebElement TextEntryButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Secure Text Entry\"]")
    private WebElement SecureTextEntryButton;

    @iOSXCUITFindBy(xpath = "(//*[@name=\"Okay / Cancel\"])[2]")
    private WebElement SecondOkayCancelAlertButton;

    @iOSXCUITFindBy(xpath = "(//*[@name=\"Other\"])[2]")
    private WebElement SecondOtherAlertButton;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement Ok;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement Cancel;

    @iOSXCUITFindBy(accessibility = "Choice One")
    private WebElement ChoiceOne;

    @iOSXCUITFindBy(accessibility = "Choice Two")
    private WebElement ChoiceTwo;

    @iOSXCUITFindBy(xpath = "//*[@type=\"XCUIElementTypeTextField\"]")
    private WebElement TextField;

    @iOSXCUITFindBy(xpath = "//*[@type=\"XCUIElementTypeSecureTextField\"]")
    private WebElement SecureTextField;

    @iOSXCUITFindBy(accessibility = "Destructive Choice")
    private WebElement DestructiveChoice;

    @iOSXCUITFindBy(accessibility = "Safe Choice")
    private WebElement SafeChoice;

    public void ClickSimpleAlertButton() {
        SimpleAlertButton.click();
    }

    public void ClickFirstOkayCancelButton() {
        FirstOkayCancelAlertButton.click();
    }

    public void ClickFirstOtherButton() {
        FirstOtherAlertButton.click();
    }

    public void ClickTextEntryButton() {
        TextEntryButton.click();
    }

    public void ClickSecureTextEntryButton() {
        SecureTextEntryButton.click();
    }

    public void ClickSecondOkayCancelButton() {
        SecondOkayCancelAlertButton.click();
    }

    public void ClickSecondOtherButton()
    {
        SecondOtherAlertButton.click();
    }

    public void ClickOk()
    {
        wait.until(ExpectedConditions.elementToBeClickable(Ok));
        Ok.click();
    }

    public void ClickCancel()
    {
        wait.until(ExpectedConditions.elementToBeClickable(Cancel));
        Cancel.click();
    }

    public void ClickChoiceOne()
    {
        ChoiceOne.click();
    }

    public void ClickChoiceTwo()
    {
        ChoiceTwo.click();
    }

    public  void SendKeysToSecureTextField()
    {
        SecureTextField.sendKeys("Hello world");
    }

    public void SendKeysToTextField()
    {
        TextField.sendKeys("Hello world");
    }
    public boolean getOkStatus()
    {
        return !Ok.isEnabled();
    }

    public void GoBack()
    {
        wait.until(ExpectedConditions.elementToBeClickable(backButton));
        backButton.click();
    }

    public void ClickSafeChoice()
    {
        SafeChoice.click();
    }

    public void ClickDestructiveChoice()
    {
        DestructiveChoice.click();
    }
}
