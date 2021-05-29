package com.makarau.zendesktests.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ZendeskLoginPage extends BasePageObject {

    @FindBy(id = "account[subdomain]")
    private WebElementFacade subDomainInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade submitButton;

    public void clickSubmit() {
        this.submitButton.click();
    }

    public void fillTheDomain(String domainValue) {
        this.subDomainInput.clear();
        this.subDomainInput.sendKeys(domainValue);
    }

}
