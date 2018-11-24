package com.explore_greece.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class Address {

    @NotNull
    @Size(max = 50)
    private String address1;

    @Size(max = 50)
    private String address2;

    @NotNull
    @Size(max = 50)
    private String city;

    @Size(max = 50)
    private String state;

    @NotNull
    @Size(max = 50)
    private String country;

    @NotNull
    @Column(name = "zip_code")
    @Size(max = 10)
    private String zipCode;

    public Address(){
    }

    public Address(String address1, String address2,
                   String city, String state,
                   String country, String zipCode)
    {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }


    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


}
