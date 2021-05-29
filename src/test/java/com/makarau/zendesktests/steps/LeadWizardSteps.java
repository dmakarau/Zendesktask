package com.makarau.zendesktests.steps;

import com.makarau.zendesktests.pageobjects.LeadWizard;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LeadWizardSteps extends ScenarioSteps  {

    LeadWizard leadWizard;

    @Step("I fill the data in the lead wizard dialog and save it")
    public void fillLeadData(String firstname, String lastname) {
        leadWizard.fillFirstName(firstname);
        leadWizard.fillLastName(lastname);
        leadWizard.clickSave();
    }
}
