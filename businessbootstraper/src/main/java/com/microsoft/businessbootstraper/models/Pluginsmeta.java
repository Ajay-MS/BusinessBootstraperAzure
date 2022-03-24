package com.example.com.FHL.Db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pluginsmeta {

    @javax.persistence.Id
    private long Id;
    private String Type;
    private String Data;

    public Pluginsmeta(long id, String type, String data) {
        Id = id;
        Type = type;
        Data = data;
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

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Pluginsmeta{" +
                "Id=" + Id +
                ", Type='" + Type + '\'' +
                ", Data='" + Data + '\'' +
                '}';
    }
}
