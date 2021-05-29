package com.makarau.zendesktests.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ZendeskDashboardPage extends BasePageObject {

    @FindBy(id = "global-add")
    private WebElementFacade addButton;

    @FindBy(xpath = "//li[@data-test-id='avatar-menu']")
    private WebElementFacade avatarMenu;

    @FindBy(id = "nav-item-leads")
    private WebElementFacade leadsMenuItem;

    @FindBy(xpath = "//div[@data-role='menu']/div/div[@data-item-index='0']")
    private WebElementFacade subMenuItemLead;

    @FindBy(id = "nav-working-leads")
    private WebElementFacade existingLeads;

    public void clickLeadsMenuItem() {
        this.leadsMenuItem.click();
    }

    public void invokeAddSubmenu() {
        this.addButton.click();
    }

    public void clickCreateNewLead() {
        this.subMenuItemLead.click();
    }

    public void clickExistingLeadsButton() {
        this.existingLeads.click();
    }

    public boolean isAvatarMenuPresent() {
        return this.avatarMenu.isPresent();
    }
}
