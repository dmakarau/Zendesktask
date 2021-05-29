package com.makarau.zendesktests;

import com.google.gson.Gson;
import com.makarau.zendesktests.models.Data;
import com.makarau.zendesktests.models.Items;
import com.makarau.zendesktests.models.Leads;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Items> getData(String jsonString) {
        Gson gson = new Gson();
        List<Items> dataList = new ArrayList<>();
        Leads leads = null;
        leads = gson.fromJson(jsonString, Leads.class);
        dataList = leads.getItems();
        return dataList;
    }
}
