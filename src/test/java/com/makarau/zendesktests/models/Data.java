package com.makarau.zendesktests.models;

import java.util.Objects;

public class Data {
    private int id;
    private int owner_id;
    private String first_name;
    private String last_name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return id == data.id && owner_id == data.owner_id && Objects.equals(first_name, data.first_name) && Objects.equals(last_name, data.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner_id, first_name, last_name);
    }
}
