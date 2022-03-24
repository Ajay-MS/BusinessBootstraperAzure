package com.example.com.FHL.Db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Business{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
