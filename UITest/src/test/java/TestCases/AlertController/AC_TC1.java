package TestCases.AlertController;

import Steps.AlertControllerNavigatingSteps;
import Steps.MainMenuNavigatingSteps;
import TestCases.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AC_TC1 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenu;
    @Steps
    AlertControllerNavigatingSteps userAtAlertControllerPage;

    @Managed
    WebDriver driver;

    @Test
    public void TestAccessibilityOfAlertController()
    {
        userAtMainMenu.ClickAlertControllerButton();
        userAtAlertControllerPage.GoBack();
    }

}
