package TestCases.Buttons;

import Steps.ButtonsNavigatingSteps;
import Steps.MainMenuNavigatingSteps;
import TestCases.BaseTestCase;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B_TC2 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenu;

    @Steps
    ButtonsNavigatingSteps userAtButtonsPage;

    @Managed
    WebDriver driver;

    @Before
    public void SetUp()
    {
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(userAtMainMenu.LookAtButtonsButton()));
        userAtMainMenu.ClickButtonsButton();
    }
    @Test
    public void CheckAllButtons()
    {
        userAtButtonsPage.CheckSystemText();
        userAtButtonsPage.CheckSystemContactAdd();
        userAtButtonsPage.CheckDetailDisclosure();
        userAtButtonsPage.CheckImage();
        userAtButtonsPage.CheckAttributedText();
    }
    @After
    public void TearDown()
    {
        userAtButtonsPage.GoBack();
    }

}
