package TestCases.DatePicker;

import Steps.DatePickerNavigatingSteps;
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

public class DP_TC2 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenu;

    @Steps
    DatePickerNavigatingSteps userAtDatePickerPage;

    @Managed
    WebDriver driver;

    @Before
    public void SetUp()
    {
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(userAtMainMenu.LookAtDatePickerButton()));
        userAtMainMenu.ClickDatePickerButton();
    }

    @Test
    public void TestFunctionalOfDatePicker()
    {
        userAtDatePickerPage.FillValuesIntoDateWheel();
    }

    @After
    public void TearDown()
    {
        userAtDatePickerPage.GoBack();
    }
}
