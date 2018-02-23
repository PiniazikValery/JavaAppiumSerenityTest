package TestCases.Buttons;

import Steps.ButtonsNavigatingSteps;
import Steps.MainMenuNavigatingSteps;
import TestCases.BaseTestCase;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class B_TC1 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenu;
    @Steps
    ButtonsNavigatingSteps userAtButtonsPage;

    @Managed
    WebDriver driver;

    @Test
    public void TestAccessibilityOfButtons()
    {
        userAtMainMenu.ClickButtonsButton();
        userAtButtonsPage.GoBack();
    }
}
