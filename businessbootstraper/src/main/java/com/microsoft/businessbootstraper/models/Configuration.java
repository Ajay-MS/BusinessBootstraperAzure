package com.microsoft.businessbootstraper.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Configuration {

    @javax.persistence.Id
    private long Id;
    private String BusinessType;
    private String JsonConfig;

    public Configuration(long id, String businessType, String JsonConfig) {
        Id = id;
        BusinessType = businessType;
        this.JsonConfig = JsonConfig;
    }
}
