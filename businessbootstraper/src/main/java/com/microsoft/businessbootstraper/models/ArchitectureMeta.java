package com.example.com.FHL.Db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ArchitectureMeta {

    @javax.persistence.Id
    private long Id;
    private String Type;
    private String Structure;

    public ArchitectureMeta(long id, String type, String structure) {
        Id = id;
        Type = type;
        Structure = structure;
    }

    public ArchitectureMeta() {

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

    public String getStructure() {
        return Structure;
    }

    public void setStructure(String structure) {
        Structure = structure;
    }

    @Override
    public String toString() {
        return "ArchitectureMeta{" +
                "Id=" + Id +
                ", Type='" + Type + '\'' +
                ", Structure='" + Structure + '\'' +
                '}';
    }
}
