package com.makarau.zendesktests.steps;

import com.makarau.zendesktests.pageobjects.ZendeskAuthorisationPage;
import com.makarau.zendesktests.pageobjects.ZendeskLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps  {

    ZendeskLoginPage zendeskLoginPage;
    ZendeskAuthorisationPage zendeskAuthorisationPage;

    @Step("I fill the domain name")
    public void fillTheDomainName(String value) {
        zendeskLoginPage.fillTheDomain(value);
        zendeskLoginPage.clickSubmit();
    }

    @Step("I fill the email and password")
    public void fillTheUserCredentials(String email, String password) {
        zendeskAuthorisationPage.fillTheEmail(email);
        zendeskAuthorisationPage.fillThePassword(password);
        zendeskAuthorisationPage.clickSubmitButton();
    }
}
