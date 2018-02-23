package Steps;

import UI.PageObjects.DatePickerPage;
import net.thucydides.core.annotations.Step;

public class DatePickerNavigatingSteps {
    DatePickerPage page;

    @Step
    public void FillValuesIntoDateWheel()
    {
        page.SetDay("Today");
        page.SetHour("10");
        page.SetMinute("55");
        page.SetPMAM("AM");
    }

    @Step
    public void GoBack()
    {
        page.ClickBackButton();
    }
}
