package TestCases.AlertController;

import Steps.AlertControllerNavigatingSteps;
import Steps.MainMenuNavigatingSteps;
import TestCases.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(SerenityRunner.class)
public class AC_TC2 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenu;
    @Steps
    AlertControllerNavigatingSteps userAtAlertControllerPage;

    @Managed
    WebDriver driver;

    @Before
    public void SetUpTestCase()
    {
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(userAtMainMenu.LookAtACButton()));
        userAtMainMenu.ClickAlertControllerButton();
    }
    @Test
    public void TestAllFunctionalOfPage()
    {
        userAtAlertControllerPage.TestSimple();
        userAtAlertControllerPage.TestFirstOkayCancel();
        userAtAlertControllerPage.TestFirstOther();
        userAtAlertControllerPage.TestTextEntry();
        userAtAlertControllerPage.TestSecureTextField();
        userAtAlertControllerPage.TestSecondOkayCancel();
        userAtAlertControllerPage.TestSecondOther();
    }
    @After
    public void TearDown()
    {
        userAtAlertControllerPage.GoBack();
    }
}
