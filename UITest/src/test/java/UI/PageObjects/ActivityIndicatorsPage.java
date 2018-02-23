package UI.PageObjects;

import UI.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivityIndicatorsPage extends BasePage {
    public  ActivityIndicatorsPage(WebDriver driver){super(driver);}
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")
    private WebElement backButton;

    @iOSXCUITFindBy(xpath = "//*[@type =\"XCUIElementTypeCell\"][1]")
    private WebElement FirstLoadingElement;

    @iOSXCUITFindBy(xpath = "//*[@type =\"XCUIElementTypeCell\"][2]")
    private WebElement SecondLoadingElement;

    public  void ClickBackButton()
    {
        backButton.click();
    }

    public WebElement getFirstLoadingElement() {
        return FirstLoadingElement;
    }

    public WebElement getSecondLoadingElement() {
        return SecondLoadingElement;
    }
}
