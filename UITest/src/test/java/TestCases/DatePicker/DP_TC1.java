package TestCases.DatePicker;

import Steps.DatePickerNavigatingSteps;
import Steps.MainMenuNavigatingSteps;
import TestCases.BaseTestCase;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DP_TC1 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenu;

    @Steps
    DatePickerNavigatingSteps userAtDatePickerPage;

    @Managed
    WebDriver driver;

    @Test
    public void TestAccessibilityOfDatePicker()
    {
        userAtMainMenu.ClickDatePickerButton();
        userAtDatePickerPage.GoBack();
    }
}
