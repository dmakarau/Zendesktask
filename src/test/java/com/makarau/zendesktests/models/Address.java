package com.makarau.zendesktests.models;

public class Address {
    private String line1;
    private String city;
    private String country;

    public Address() {}
    public Address(String country, String city, String addressLine) {
        this.country = country;
        this.city = city;
        this.line1 = addressLine;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
