package com.makarau.zendesktests.stepsdefinitiions;

import io.cucumber.java.en.And;

public class CommonStepsDefinitions extends  BaseStepsDefinitions {

    @And("I accept cookies")
    public void acceptCookies() {
        baseSteps.acceptCookiesIfAppears();
    }
}
