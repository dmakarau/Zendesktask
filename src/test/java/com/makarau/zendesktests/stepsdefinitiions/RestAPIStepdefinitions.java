package com.makarau.zendesktests.stepsdefinitiions;

import com.makarau.zendesktests.TestData;
import com.makarau.zendesktests.models.Address;
import com.makarau.zendesktests.models.Items;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class RestAPIStepdefinitions extends BaseStepsDefinitions {

    @Given("I create a Lead via API with the first name {string} and the last name {string}")
    public void createLeadViaAPI(String firstname, String lastname) {
        restAPISteps.createLead(firstname, lastname);
    }

    @Then("I verify the lead with lastname {string} exist")
    public void verifyLeadExists(String lastname) {
        List<Items> dataList = restAPISteps.getAllLeads();
        for (Items items : dataList) {
            if (items.getData().getLast_name().equals(lastname)) {
                System.out.println("OK, the user exist");
                return;
            }
        }
        Assert.fail("The user with the last name " + lastname + " was not found");
    }

    @And("I add to the lead with lastname {string} city {string}, country {string} and address {string}")
    public void addAddressToTheLead(String leadLastname, String city, String country, String line) {
        Address address = new Address(country, city, line);
        List<Items> dataList = restAPISteps.getAllLeads();
        int targetLeadId = restAPISteps.getLeadId(leadLastname, dataList);
        restAPISteps.addAddressToTheLead(targetLeadId, address);
    }

    @Then("I verify the lead with lastname {string} has address with city {string}, country {string}, and street {string}")
    public void verifyTheLeadsAddress(String leadLastname, String city, String country, String street) {
        SoftAssert softAssert = new SoftAssert();
        List<Items> dataList = restAPISteps.getAllLeads();
        int targetLeadId = restAPISteps.getLeadId(leadLastname, dataList);
        for (Items items : dataList) {
            if (items.getData().getId() == targetLeadId) {
                String actualCity = items.getData().getAddress().getCity();
                String actualCountry = items.getData().getAddress().getCountry();
                String actualAddressLine = items.getData().getAddress().getLine1();
                softAssert.assertTrue(actualCity.equals(city), "ERROR-> Expected city is " + city + " but found " + actualCity + "\n");
                softAssert.assertTrue(actualCountry.equals(country), "ERROR-> Expected country is " + country + " but found " + country + "\n");
                softAssert.assertTrue(actualAddressLine.equals(street), "ERROR-> Expected address line is " + street + "but found " + actualAddressLine + "\n");
                softAssert.assertAll();
                return;
            }
        }
        Assert.fail("ERROR-> Lead with the last name " + leadLastname + " was not found\n");
    }

    @And("I delete the lead with lastname {string} via API")
    public void deleteTheLeadByLastname(String lastname) {
        List<Items> dataList = restAPISteps.getAllLeads();
        int targetLeadId = restAPISteps.getLeadId(lastname, dataList);
        restAPISteps.deleteLead(targetLeadId);
    }
}
