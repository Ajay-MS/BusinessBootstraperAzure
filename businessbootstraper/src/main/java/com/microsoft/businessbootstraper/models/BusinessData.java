package com.microsoft.businessbootstraper.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@ToString
@NoArgsConstructor
public class BusinessData {

    private long Id;
    private String Name;
    private int Type;
    private boolean isProvisioned;
    private String AdminURL;
    private String UserPortal;
    private String Metadata;

    public void SetFromBusiness(Business business)
    {
        Id= business.getId();
        Name=business.getName();
        Type= business.getType();
    }

    public void SetFromBusinessProfile(BusinessProfile profile)
    {
        AdminURL=profile.getAdminURL();
        UserPortal=profile.getUserPortal();
        Metadata=profile.getMetadata();
    }


}
