package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by polev on 13.04.2017.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
     @Id
    @GeneratedValue (generator = "uuid")
    @Column(name = "id")
     private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
