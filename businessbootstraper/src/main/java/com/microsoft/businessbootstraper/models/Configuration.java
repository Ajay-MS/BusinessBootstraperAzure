package com.example.com.FHL.Db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Configuration {

    @javax.persistence.Id
    private long Id;
    private String BusinessType;
    private String JSONconfig;

    public Configuration(long id, String businessType, String JSONconfig) {
        Id = id;
        BusinessType = businessType;
        this.JSONconfig = JSONconfig;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getBusinessType() {
        return BusinessType;
    }

    public void setBusinessType(String businessType) {
        BusinessType = businessType;
    }

    public String getJSONconfig() {
        return JSONconfig;
    }

    public void setJSONconfig(String JSONconfig) {
        this.JSONconfig = JSONconfig;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "Id=" + Id +
                ", BusinessType='" + BusinessType + '\'' +
                ", JSONconfig='" + JSONconfig + '\'' +
                '}';
    }
}
