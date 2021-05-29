package com.makarau.zendesktests.stepsdefinitiions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashboardStepsDefinitions extends BaseStepsDefinitions {

    @And("I am in the Zendesk dashboard")
    public void verifyTheDashboardIsOpened() {
        dashboardSteps.verifyTheDashboardIsPresent();
    }

    @Then("I create a Lead with firstname {string} and lastname {string}")
    public void creatLead(String firstname, String lastname) {
        dashboardSteps.invokeLeadWizardDialog();
        leadWizardSteps.fillLeadData(firstname, lastname);
    }

    @Then("I navigate to the Leads Table")
    public void navigateToTheLeads() {
        dashboardSteps.navigateToLeadsMenu();
    }
}
