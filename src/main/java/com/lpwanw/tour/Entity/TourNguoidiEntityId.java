package com.lpwanw.tour.Entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TourNguoidiEntityId implements Serializable {
    private static final long serialVersionUID = -5329990322251891754L;
    @Column(name = "nguoidi_id", nullable = false)
    private Integer nguoidiId;
    @Column(name = "doan_id", nullable = false)
    private Integer doanId;

    public Integer getDoanId() {
        return doanId;
    }

    public void setDoanId(Integer doanId) {
        this.doanId = doanId;
    }

    public Integer getNguoidiId() {
        return nguoidiId;
    }

    public void setNguoidiId(Integer nguoidiId) {
        this.nguoidiId = nguoidiId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nguoidiId, doanId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TourNguoidiEntityId entity = (TourNguoidiEntityId) o;
        return Objects.equals(this.nguoidiId, entity.nguoidiId) &&
                Objects.equals(this.doanId, entity.doanId);
    }
}