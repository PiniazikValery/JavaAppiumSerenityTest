package UI.PageObjects;

import UI.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver){super(driver);}

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")
    private WebElement backButton;

    @iOSXCUITFindBy(xpath = "(//*[@name=\"Button\"])[1]")
    private WebElement SystemText;

    @iOSXCUITFindBy(xpath = "(//*[@name=\"Button\"])[2]")
    private WebElement AttributedText;

    @iOSXCUITFindBy(xpath = "(//*[@type=\"XCUIElementTypeCell\"])[2]//*[@type=\"XCUIElementTypeButton\"]")
    private WebElement SystemContactAdd;

    @iOSXCUITFindBy(accessibility = "More Info")
    private WebElement SystemDetailDisclosur;

    @iOSXCUITFindBy(accessibility = "X Button")
    private WebElement Image;


    public void ClickBackButton()
    {
        backButton.click();
    }

    public WebElement getAttributedText() {
        return AttributedText;
    }

    public WebElement getImage() {
        return Image;
    }

    public WebElement getSystemContactAdd() {
        return SystemContactAdd;
    }

    public WebElement getSystemDetailDisclosur() {
        return SystemDetailDisclosur;
    }

    public WebElement getSystemText() {
        return SystemText;
    }
}
