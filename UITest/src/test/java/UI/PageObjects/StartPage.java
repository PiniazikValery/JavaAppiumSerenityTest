package UI.PageObjects;

import UI.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver){super(driver);}
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")
    private WebElement backButton;

    public void ClickBackButton(){
        backButton.click();
    }
}
