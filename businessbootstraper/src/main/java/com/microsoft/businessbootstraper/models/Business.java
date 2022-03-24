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
public class Business {

    @javax.persistence.Id
    private long Id;
    private String Name;
    private String Type;

    public Business(long id, String name, String type) {
        Id = id;
        Name = name;
        Type = type;
    }

}
