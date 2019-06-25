package com.temelt.issuemanagment.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
// @Data
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
