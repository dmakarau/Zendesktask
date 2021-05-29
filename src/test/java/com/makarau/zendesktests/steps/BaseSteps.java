package com.makarau.zendesktests.steps;

import com.makarau.zendesktests.pageobjects.BasePageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {

    BasePageObject basePageObject;

    @Step("Open the URL {}")
    public void openUrl(String url) {
        getDriver().get(url);
    }

    @Step("Reload the page")
    public void reload() {
        getDriver().navigate().refresh();
    }

    @Step("Accept cookies")
    public void acceptCookiesIfAppears() {
        if (basePageObject.isAcceptCookiesButtonPresent()) {
            basePageObject.clickAcceptCookies();
        }
    }



}
