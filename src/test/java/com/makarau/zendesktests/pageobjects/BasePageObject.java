package com.makarau.zendesktests.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static java.time.temporal.ChronoUnit.SECONDS;

public class BasePageObject extends PageObject {

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElementFacade acceptCookiesButton;

    public void clickAcceptCookies() {
        this.acceptCookiesButton.click();
    }

    public boolean isAcceptCookiesButtonPresent() {
        return acceptCookiesButton.isPresent();
    }

    protected boolean isElementPresent(WebElementFacade element) {
        return element.isPresent();
    }

    protected boolean isElementPresent(WebElementFacade element, int waitingTimeSec) {
        setImplicitTimeout(waitingTimeSec, SECONDS);
        boolean isPresent = element.isPresent();
        resetImplicitTimeout();
        return isPresent;
    }

    protected void switchToFrame(int numberOfFrame) {
        getDriver().switchTo().frame(numberOfFrame);
    }

    protected void switchToDefaultContent() {
        getDriver().switchTo().defaultContent();
    }
}
