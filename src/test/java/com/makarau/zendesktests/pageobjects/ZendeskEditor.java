package com.makarau.zendesktests.pageobjects;

import com.makarau.zendesktests.stepsdefinitiions.BaseStepsDefinitions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ZendeskEditor extends BasePageObject {

    @FindBy(xpath = "//span[@data-action='lead-status-dropdown']")
    private WebElementFacade leadStatus;

    @FindAll({
//            @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a")
            @FindBy(xpath = "//div[@tabindex='1']/div/div")
    })
    private List<WebElementFacade> statusOptions;

    @FindBy(xpath = "//button[@data-action='save']")
    private WebElementFacade saveButton;

    public void invokeStatusMenu() {
        this.leadStatus.click();
    }

    public void selectLeadStatus(BaseStepsDefinitions.LeadStatus status) {
        for (WebElementFacade el : statusOptions) {
            if (el.getText().equals(status.getValue())) {
                el.click();
                return;
            }
        }
    }

    public void clickSaveButton() {
        this.saveButton.click();
    }
}
