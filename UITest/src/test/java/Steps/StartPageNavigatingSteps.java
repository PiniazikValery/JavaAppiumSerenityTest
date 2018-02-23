package Steps;

import UI.PageObjects.StartPage;
import net.thucydides.core.annotations.Step;

public class StartPageNavigatingSteps {
    StartPage page;
    @Step
    public void ClickBackButton() {
        page.ClickBackButton();
    }
}
