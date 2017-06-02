package com.yangchen.xincheng.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yangchen on 2017/6/2.
 */
@MappedSuperclass
public class AbstractAuditEntity extends  BaseAbstractEntity{

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;


    @PrePersist
    protected void prePersist() {
        createdOn = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        modifiedOn = new Date();
    }


    public Date getCreatedOn() {
        return createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }
}
