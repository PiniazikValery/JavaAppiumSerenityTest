package Steps;

import UI.PageObjects.AlertControllerPage;
import net.thucydides.core.annotations.Step;
import static org.junit.Assert.*;

public class AlertControllerNavigatingSteps {
    AlertControllerPage page;


    @Step
    public void TestSimple()
    {
        page.ClickSimpleAlertButton();
        page.ClickOk();
    }

    @Step
    public void TestFirstOkayCancel()
    {
        page.ClickFirstOkayCancelButton();
        page.ClickOk();
        page.ClickFirstOkayCancelButton();
        page.ClickCancel();
    }

    @Step
    public void TestFirstOther()
    {
        page.ClickFirstOtherButton();
        page.ClickChoiceOne();
        page.ClickFirstOtherButton();
        page.ClickChoiceTwo();
        page.ClickFirstOtherButton();
        page.ClickCancel();
    }

    @Step
    public void TestTextEntry()
    {
        page.ClickTextEntryButton();
        page.SendKeysToTextField();
        page.ClickOk();
        page.ClickTextEntryButton();
        page.SendKeysToTextField();
        page.ClickCancel();
    }

    @Step
    public void TestSecureTextField()
    {
        page.ClickSecureTextEntryButton();
        assertTrue("Ok is disabled,when empty text field",page.getOkStatus());
        page.SendKeysToSecureTextField();
        page.ClickOk();
        page.ClickSecureTextEntryButton();
        page.SendKeysToSecureTextField();
        page.ClickCancel();
    }

    @Step
    public void TestSecondOkayCancel()
    {
        page.ClickSecondOkayCancelButton();
        page.ClickOk();
        page.ClickSecondOkayCancelButton();
        page.ClickCancel();
    }

    @Step
    public void TestSecondOther()
    {
        page.ClickSecondOtherButton();
        page.ClickSafeChoice();
        page.ClickSecondOtherButton();
        page.ClickDestructiveChoice();
    }

    @Step
    public void GoBack()
    {
        page.GoBack();
    }
}
