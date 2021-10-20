package com.lpwanw.tour.Entity;

import javax.persistence.*;

@Table(name = "tour_nguoidi", indexes = {
        @Index(name = "doan_id", columnList = "doan_id")
})
@Entity
public class TourNguoidiEntity {
    @EmbeddedId
    private TourNguoidiEntityId id;

    @Lob
    @Column(name = "nguoidi_dsnhanvien", nullable = false)
    private String nguoidiDsnhanvien;

    @Lob
    @Column(name = "nguoidi_dskhach", nullable = false)
    private String nguoidiDskhach;

    public String getNguoidiDskhach() {
        return nguoidiDskhach;
    }

    public void setNguoidiDskhach(String nguoidiDskhach) {
        this.nguoidiDskhach = nguoidiDskhach;
    }

    public String getNguoidiDsnhanvien() {
        return nguoidiDsnhanvien;
    }

    public void setNguoidiDsnhanvien(String nguoidiDsnhanvien) {
        this.nguoidiDsnhanvien = nguoidiDsnhanvien;
    }

    public TourNguoidiEntityId getId() {
        return id;
    }

    public void setId(TourNguoidiEntityId id) {
        this.id = id;
    }
}