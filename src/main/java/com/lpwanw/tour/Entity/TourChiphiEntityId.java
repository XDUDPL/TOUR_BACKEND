package com.lpwanw.tour.Entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TourChiphiEntityId implements Serializable {
    private static final long serialVersionUID = 8295992046365649304L;
    @Column(name = "chiphi_id", nullable = false)
    private Integer chiphiId;
    @Column(name = "doan_id", nullable = false)
    private Integer doanId;

    public Integer getDoanId() {
        return doanId;
    }

    public void setDoanId(Integer doanId) {
        this.doanId = doanId;
    }

    public Integer getChiphiId() {
        return chiphiId;
    }

    public void setChiphiId(Integer chiphiId) {
        this.chiphiId = chiphiId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chiphiId, doanId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TourChiphiEntityId entity = (TourChiphiEntityId) o;
        return Objects.equals(this.chiphiId, entity.chiphiId) &&
                Objects.equals(this.doanId, entity.doanId);
    }
}