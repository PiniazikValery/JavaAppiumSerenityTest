package TestCases;

import Steps.StartPageNavigatingSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTestCase {

    @Steps
    StartPageNavigatingSteps user;

    @Managed
    WebDriver driver;


    @Before
    public void SetUpApp()
    {
        user.ClickBackButton();
    }
    @After
    public void TearDownApp()
    {
        driver.close();
    }
}