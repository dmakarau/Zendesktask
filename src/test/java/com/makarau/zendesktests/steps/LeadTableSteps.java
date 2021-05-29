package com.makarau.zendesktests.steps;

import com.makarau.zendesktests.pageobjects.ZendeskEditor;
import com.makarau.zendesktests.pageobjects.ZendeskLeadViewPage;
import com.makarau.zendesktests.pageobjects.ZendeskLeadsPage;
import com.makarau.zendesktests.stepsdefinitiions.BaseStepsDefinitions;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.testng.Assert;

public class LeadTableSteps extends ScenarioSteps {
    ZendeskLeadsPage zendeskLeadsPage;
    ZendeskEditor zendeskEditor;
    ZendeskLeadViewPage zendeskLeadViewPage;

    @Step("I fill the value in the search filter")
    public void fillTheFilter(String value) {
        zendeskLeadsPage.searchTheNameOfTheLead(value);
    }

    @Step("I clear the filters if they exist")
    public void cleanAllFilters() {
        if (zendeskLeadsPage.isClearFiltersButtonPresent()) {
            zendeskLeadsPage.clickClearFilters();
        }
    }

    @Step("Verify the status")
    public void verifyStatus(String expectedStatus) {
        String actualStatus = zendeskLeadsPage.getStatusOfTheFilteredLead();
        Assert.assertTrue(actualStatus.equals(expectedStatus), "ERROR-> Expected status is " + expectedStatus +
                " but found: " + actualStatus);
    }

    @Step("Select the lead")
    public void selectTheLead() {
        zendeskLeadsPage.selectTheFirstResultInSearch();
    }

    @Step("Click edit the Lead")
    public void editTheLead() {
        zendeskLeadViewPage.clickLeadEditButton();
    }

    @Step("Change the status of the Lead and Save")
    public void updateTheLead(String newStatus) {
        zendeskEditor.invokeStatusMenu();
        zendeskEditor.selectLeadStatus(BaseStepsDefinitions.LeadStatus.valueOf(newStatus.toUpperCase()));
        zendeskEditor.clickSaveButton();
    }
}
