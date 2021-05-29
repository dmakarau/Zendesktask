package com.makarau.zendesktests.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ZendeskAuthorisationPage extends BasePageObject {

    @FindBy(id = "user_email")
    private WebElementFacade userEmailInput;

    @FindBy(id = "user_password")
    private WebElementFacade passwordInput;

    @FindBy(id = "sign-in-submit-button")
    private WebElementFacade submitButton;

    public void clickSubmitButton() {
        switchToFrame(0);
        this.submitButton.click();
        switchToDefaultContent();

    }

    public void fillTheEmail(String email) {
        switchToFrame(0);
        this.userEmailInput.clear();
        this.userEmailInput.sendKeys(email);
        switchToDefaultContent();
    }

    public void fillThePassword(String password) {
        switchToFrame(0);
        this.passwordInput.clear();
        this.passwordInput.sendKeys(password);
        switchToDefaultContent();
    }
}
