package Steps;

import UI.PageObjects.ActivityIndicatorsPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class ActivityIndicatorsNavigatingSteps {
    ActivityIndicatorsPage page;

    @Step
    public  void ClickBackButton()
    {
        page.ClickBackButton();
    }
    @Step
    public WebElement LookAtFirstLoadingElement()
    {
        return page.getFirstLoadingElement();
    }
    @Step
    public  WebElement LookAtSecondLoadingElement()
    {
        return  page.getSecondLoadingElement();
    }
}
