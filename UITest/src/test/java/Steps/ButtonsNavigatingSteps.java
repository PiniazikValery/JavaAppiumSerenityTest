package Steps;

import UI.PageObjects.ButtonsPage;
import net.thucydides.core.annotations.Step;

public class ButtonsNavigatingSteps {
    ButtonsPage page;

    @Step
    public void GoBack()
    {
        page.ClickBackButton();
    }

    @Step
    public void CheckSystemText()
    {
        assert(page.getSystemText()).isDisplayed();
    }
    @Step
    public void CheckSystemContactAdd()
    {
        assert(page.getSystemContactAdd()).isDisplayed();
    }
    @Step
    public void CheckDetailDisclosure()
    {
        assert(page.getSystemDetailDisclosur()).isDisplayed();
    }
    @Step
    public void CheckImage()
    {
        assert(page.getImage()).isDisplayed();
    }
    @Step
    public void CheckAttributedText()
    {
        assert(page.getAttributedText()).isDisplayed();
    }
}
