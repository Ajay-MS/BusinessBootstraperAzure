package com.microsoft.businessbootstraper.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@ToString
@NoArgsConstructor
public class BusinessProfile {

    @javax.persistence.Id
    private long Id;
    private String AdminURL;
    private String UserPortal;
    private String Metadata;

    public BusinessProfile(long id, String adminURL, String userPortal, String metadata) {
        Id = id;
        AdminURL = adminURL;
        UserPortal = userPortal;
        Metadata = metadata;
    }
}
