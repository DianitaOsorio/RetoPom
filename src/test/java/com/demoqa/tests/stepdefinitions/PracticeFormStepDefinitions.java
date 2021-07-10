package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.steps.FormPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticeFormStepDefinitions {

    @Steps
    FormPageSteps formPageSteps;

    @Given("^a web user wants to register in the form$")
    public void aWebUserWantsToRegisterInTheForm() {
    formPageSteps.openBrowser();
    }

    @When("^you fill in all the fields of the form$")
    public void youFillInAllTheFieldsOfTheForm() throws InterruptedException{
        formPageSteps.fillAllFieldsForm();
    }

    @Then("^you can see the form with the corresponding information$")
    public void youCanSeeTheFormWithTheCorrespondingInformation() {

    }
}
