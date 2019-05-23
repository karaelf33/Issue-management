package com.temelt.issuemanagment.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
// @Data
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    @Column(name = "create_At")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "create_By",length = 100)
    private String createBy;

    @Column(name = "updated_At")
    private Date updatedAt;

    @Column(name = "updated_By",length = 100)
    private String updatedBy;

    @Column(name = "status")
    private   Boolean status;

}
