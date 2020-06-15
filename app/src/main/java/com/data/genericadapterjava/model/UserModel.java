package com.data.genericadapterjava.model;

public class UserModel {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public UserModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserModel setAddress(String address) {
        this.address = address;
        return this;
    }
}
