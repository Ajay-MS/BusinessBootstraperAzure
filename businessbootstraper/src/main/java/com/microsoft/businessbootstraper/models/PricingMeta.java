package com.example.com.FHL.Db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PricingMeta {

    @javax.persistence.Id
    private long Id;
    private String Type;
    private String Pricing;

    public PricingMeta(long id, String type, String pricing) {
        Id = id;
        Type = type;
        Pricing = pricing;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPricing() {
        return Pricing;
    }

    public void setPricing(String pricing) {
        Pricing = pricing;
    }
}
