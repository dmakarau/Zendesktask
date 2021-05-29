package com.makarau.zendesktests.stepsdefinitiions;

import com.makarau.zendesktests.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginStepsDefinitions extends BaseStepsDefinitions {

    @And("I login with the credentials")
    public void loginToTheZendeskDashboard() {
        loginSteps.fillTheDomainName(TestData.subDomain);
        loginSteps.fillTheUserCredentials(TestData.email, TestData.password);
    }

    @Given("I am on the zendesk login page")
    public void openWebPage() {
        baseSteps.openUrl("https://www.zendesk.com/login#login");
        baseSteps.acceptCookiesIfAppears();
    }
}
