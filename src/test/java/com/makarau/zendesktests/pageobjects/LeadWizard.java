package com.makarau.zendesktests.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LeadWizard extends BasePageObject {

    @FindBy(xpath = "//div[@data-action='lead-first-name-input']/input")
    private WebElementFacade firstNameInput;

    @FindBy(xpath = "//div[@data-action='lead-last-name-input']/input")
    private WebElementFacade lastNameInput;

    @FindBy(xpath = "//button[@data-action='save']")
    private WebElementFacade saveButton;

    public void fillFirstName(String fistName) {
        this.firstNameInput.click();
        this.firstNameInput.clear();
        this.firstNameInput.sendKeys(fistName);
    }

    public void fillLastName(String lastName) {
        this.lastNameInput.clear();
        this.lastNameInput.sendKeys(lastName);
    }

    public void clickSave() {
        this.saveButton.click();
    }

}
