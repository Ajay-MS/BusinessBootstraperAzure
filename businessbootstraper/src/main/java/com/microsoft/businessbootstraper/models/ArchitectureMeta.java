package com.microsoft.businessbootstraper.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString
@Data
@NoArgsConstructor
public class ArchitectureMeta {

    @javax.persistence.Id
    private long Id;
    private String Type;
    @Column( length = 10000 )
    private String Structure;

    public ArchitectureMeta(long id, String type, String structure) {
        Id = id;
        Type = type;
        Structure = structure;
    }
}
