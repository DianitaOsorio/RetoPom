package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.Formpage;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class FormPageSteps {
    Formpage formpage = new Formpage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser() {
        formpage.open();
    }

    @Step
    public void fillAllFieldsForm() throws InterruptedException {
        formpage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(20000);
        formpage.sendFirstName(dataInjection.getFirstName());
        formpage.sendLastName(dataInjection.getLastName());
        formpage.sendUserEmail(dataInjection.getEmail());
        formpage.sendGenderRadioClick();
        formpage.sendUserNumber(dataInjection.getNumberMobile());
        //formpage.clickHobbiesCheckbox();
        Times.waitFor(20000);
        JavaScript.clickJS(formpage.getDriver(), formpage.SUBMIT_BUTTON);


}
}