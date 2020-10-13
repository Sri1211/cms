package com.example.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CustomerId;
    @JsonProperty("firstName")
    private String CustomerFirstName;
    @JsonProperty("lastName")
    private String CustomerLatName;
    @JsonProperty("email")
    private String CustomerEmail;

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerFirstName() {
        return CustomerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        CustomerFirstName = customerFirstName;
    }

    public String getCustomerLatName() {
        return CustomerLatName;
    }

    public void setCustomerLatName(String customerLatName) {
        CustomerLatName = customerLatName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }
}
