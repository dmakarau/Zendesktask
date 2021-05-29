package com.makarau.zendesktests.stepsdefinitiions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LeadsTableStepsDefinitions extends BaseStepsDefinitions {

    @Then("I search the lastname {string} in the filter")
    public void searchItemInFilter(String value) {
        leadTableSteps.cleanAllFilters();
        leadTableSteps.fillTheFilter(value);
    }

    @And("I verify the status is {string}")
    public void verifyTheStatus(String expectedStatus) {
        leadTableSteps.verifyStatus(expectedStatus);
    }

    @And("I change the status to {string}")
    public void changeTheStatusOfLead(String newStatus) {
        leadTableSteps.selectTheLead();
        leadTableSteps.editTheLead();
        leadTableSteps.updateTheLead(newStatus);
    }
}
