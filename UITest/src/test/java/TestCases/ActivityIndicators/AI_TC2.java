package TestCases.ActivityIndicators;

import Steps.ActivityIndicatorsNavigatingSteps;
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
public class AI_TC2 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenu ;
    @Steps
    ActivityIndicatorsNavigatingSteps userAtActivityIndicatorsPage;

    @Managed
    WebDriver driver;


    @Before
    public  void SetUpTestCase()
    {
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(userAtMainMenu.LookAtAIButton()));
        userAtMainMenu.ClickActivityIndicatorsButton();
    }
    @Test
    public void CheckAllActivityIndicators()
    {
        assert(userAtActivityIndicatorsPage.LookAtFirstLoadingElement()).isDisplayed();
        assert(userAtActivityIndicatorsPage.LookAtSecondLoadingElement()).isDisplayed();
    }
    @After
    public void TearDownTestCase()
    {
        userAtActivityIndicatorsPage.ClickBackButton();
    }
}
