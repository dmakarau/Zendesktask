package com.makarau.zendesktests.models;

import java.util.ArrayList;
import java.util.List;

public class Leads {
    private List<Items> items = new ArrayList<>();

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
