package com.example.listviewparsedatajson.data.model;

import com.google.gson.annotations.SerializedName;

public class BaseResponse {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("username")
    private String username;

    @SerializedName("email")
    private String email;

    @SerializedName("address")
    private AddressItem address;

    @SerializedName("phone")
    private String phone;

    @SerializedName("website")
    private String website;

    @SerializedName("company")
    private CompanyItem company;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public AddressItem getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public CompanyItem getCompany() {
        return company;
    }
}
