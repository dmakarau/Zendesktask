package com.makarau.zendesktests.steps;

import com.makarau.zendesktests.TestData;
import com.makarau.zendesktests.Utils;
import com.makarau.zendesktests.models.Address;
import com.makarau.zendesktests.models.Items;
import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

public class RestAPISteps extends ScenarioSteps  {

    @Step("Creat a lead via API")
    public void createLead(String firstname, String lastname) {
        StringBuilder body = new StringBuilder();
        body.append("{\"data\": { \"first_name\": \""+ firstname + "\", \"last_name\": \"" + lastname + "\" } }");
        SerenityRest.given()
                .contentType("application/json")
                .accept("application/json")
                .auth().oauth2(TestData.authString)
                .body(body.toString())
                .when().post("https://api.getbase.com/v2/leads");
    }

    @Step("Return lead id by last name")
    public int getLeadId(String lastname, List<Items> leads) {
        for (Items items : leads) {
            if (items.getData().getLast_name().equals(lastname)) {
                return items.getData().getId();
            }
        }
        return -1;
    }

    public List<Items> getAllLeads() {
        ResponseBody a= SerenityRest.given()
                .accept("application/json")
                .auth().oauth2(TestData.authString)
                .when().get("https://api.getbase.com/v2/leads")
                .andReturn().getBody();
        List<Items> dataList = Utils.getData(a.asString());
        return  dataList;
    }

    public void addAddressToTheLead(int leadId, Address address) {
        StringBuilder body =  new StringBuilder();
        body.append("{\"data\": { \"address\": { \"country\": \"" + address.getCountry() + "\", \"city\": \"" + address.getCity() + "\", \"line1\": \"" + address.getLine1() + "\"} } }");
        SerenityRest.given()
                .contentType("application/json")
                .accept("application/json")
                .auth().oauth2(TestData.authString)
                .body(body.toString())
                .when().put("https://api.getbase.com/v2/leads/" + leadId);
    }

    public void deleteLead(int leadId) {
        StringBuilder body =  new StringBuilder();
        SerenityRest.given()
                .auth().oauth2(TestData.authString)
                .when().delete("https://api.getbase.com/v2/leads/" + leadId);
    }
}
