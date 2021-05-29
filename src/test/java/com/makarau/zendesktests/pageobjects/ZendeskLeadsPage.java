package com.makarau.zendesktests.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ZendeskLeadsPage extends BasePageObject {

    @FindBy(xpath = "//div[@data-test-id='smartlist-search-input']/input")
    private WebElementFacade smartSearchFilterInput;

    @FindBy(xpath = "//div[@data-test-row-index='0']/div[@data-column='status']/div/div")
    private WebElementFacade statusLabel;

    @FindBy(xpath = "//button[@data-action='clear-all-filters-table-button']")
    private WebElementFacade clearFilters;

    public void searchTheNameOfTheLead(String lastName) {
        this.smartSearchFilterInput.clear();
        this.smartSearchFilterInput.sendKeys(lastName);
    }

    public void clickClearFilters() {
        this.clearFilters.click();
    }

    public void selectTheFirstResultInSearch() {
        getDriver().findElement(By.xpath("//div[@data-column='display_name']/div/a")).click();
    }

    public String getStatusOfTheFilteredLead() {
        return this.statusLabel.getText();
    }

    public boolean isClearFiltersButtonPresent() {
        return this.clearFilters.isPresent();
    }
}
