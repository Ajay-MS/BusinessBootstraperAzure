package com.microsoft.businessbootstraper.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@ToString
@NoArgsConstructor
public class PluginsMeta {

    @javax.persistence.Id
    private long Id;
    private String Type;
    private String Data;

    public PluginsMeta(long id, String type, String data) {
        Id = id;
        Type = type;
        Data = data;
    }

}
