package com.makarau.zendesktests.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ZendeskLeadViewPage extends BasePageObject {

    @FindBy(className = "detail-title")
    private WebElementFacade leadTitleLabel;

    @FindBy(xpath = "//a[@data-keyboard-shortcuts-id='detail-edit']")
    private WebElementFacade leadEditButton;

    public void clickLeadEditButton() {
        this.leadEditButton.click();
    }
}
