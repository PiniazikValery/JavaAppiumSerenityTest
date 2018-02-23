package Steps;

import UI.PageObjects.MainMenuPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class MainMenuNavigatingSteps {
    MainMenuPage page;

    @Step
    public void ClickActivityIndicatorsButton()
    {
        page.ClickActivityIndicatorsButton();
    }
    @Step
    public WebElement LookAtAIButton()
    {
        return page.getActivityIndicatorsButton();
    }
    @Step
    public void ClickAlertControllerButton(){page.ClickAlertControllerButton();}
    @Step
    public WebElement LookAtACButton()
    {
        return page.getAlertControllerButton();
    }
    @Step
    public void ClickButtonsButton(){page.ClickButtonsButton();}
    @Step
    public WebElement LookAtButtonsButton(){return page.getButtonsButton();}
    @Step
    public void ClickDatePickerButton(){page.ClickDatePicker();}
    @Step
    public WebElement LookAtDatePickerButton(){return page.getDatePicker();}
}
