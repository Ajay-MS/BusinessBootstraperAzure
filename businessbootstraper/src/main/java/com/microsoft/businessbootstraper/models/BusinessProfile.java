package com.example.com.FHL.Db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusinessProfile {

    @javax.persistence.Id
    private long Id;
    private String AdminURL;
    private String UserPortal;
    private String  Metdata;

    public BusinessProfile(long id, String adminURL, String userPortal, String metdata) {
        Id = id;
        AdminURL = adminURL;
        UserPortal = userPortal;
        Metdata = metdata;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAdminURL() {
        return AdminURL;
    }

    public void setAdminURL(String adminURL) {
        AdminURL = adminURL;
    }

    public String getUserPortal() {
        return UserPortal;
    }

    public void setUserPortal(String userPortal) {
        UserPortal = userPortal;
    }

    public String getMetdata() {
        return Metdata;
    }

    public void setMetdata(String metdata) {
        Metdata = metdata;
    }

    @Override
    public String toString() {
        return "BusinessProfile{" +
                "Id=" + Id +
                ", AdminURL='" + AdminURL + '\'' +
                ", UserPortal='" + UserPortal + '\'' +
                ", Metdata='" + Metdata + '\'' +
                '}';
    }
}
