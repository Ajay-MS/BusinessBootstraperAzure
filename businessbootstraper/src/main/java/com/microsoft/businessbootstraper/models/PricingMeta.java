package com.microsoft.businessbootstraper.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@ToString
@NoArgsConstructor
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
}
