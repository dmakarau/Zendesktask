package com.makarau.zendesktests.steps;

import com.makarau.zendesktests.pageobjects.ZendeskDashboardPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.testng.Assert;

public class DashboardSteps extends ScenarioSteps  {

    ZendeskDashboardPage zendeskDashboardPage;

    @Step("Verify that the dashboard's avatar menu is present")
    public void verifyTheDashboardIsPresent() {
        if (!zendeskDashboardPage.isAvatarMenuPresent()) {
            Assert.fail("ERROR-> The dashboard's avatar menu was not loaded");
        }
    }

    @Step("Click Add Lead on the Dashboard")
    public void invokeLeadWizardDialog() {
        zendeskDashboardPage.invokeAddSubmenu();
        zendeskDashboardPage.clickCreateNewLead();
    }

    @Step("Click Leads Menu Item")
    public void navigateToLeadsMenu() {
        zendeskDashboardPage.clickLeadsMenuItem();
    }
}
