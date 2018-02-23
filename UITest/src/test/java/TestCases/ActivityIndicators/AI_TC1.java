package TestCases.ActivityIndicators;

import Steps.ActivityIndicatorsNavigatingSteps;
import Steps.MainMenuNavigatingSteps;
import TestCases.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AI_TC1 extends BaseTestCase {
    @Steps
    MainMenuNavigatingSteps userAtMainMenuPage;
    @Steps
    ActivityIndicatorsNavigatingSteps userAtActivityIndicatorsPage;

    @Managed
    WebDriver driver;

    @Test
    public void TestAccessibilityOfActivityIndicators()
    {
        userAtMainMenuPage.ClickActivityIndicatorsButton();
        userAtActivityIndicatorsPage.ClickBackButton();
    }
}
