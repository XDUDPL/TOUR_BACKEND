package com.lpwanw.tour.Entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "tour_chiphi", indexes = {
        @Index(name = "doan_id", columnList = "doan_id")
})
@Entity
public class TourChiphiEntity {
    @EmbeddedId
    private TourChiphiEntityId id;

    @Column(name = "chiphi_total", nullable = false, precision = 10)
    private BigDecimal chiphiTotal;

    @Lob
    @Column(name = "chiphi_chitiet", nullable = false)
    private String chiphiChitiet;

    public String getChiphiChitiet() {
        return chiphiChitiet;
    }

    public void setChiphiChitiet(String chiphiChitiet) {
        this.chiphiChitiet = chiphiChitiet;
    }

    public BigDecimal getChiphiTotal() {
        return chiphiTotal;
    }

    public void setChiphiTotal(BigDecimal chiphiTotal) {
        this.chiphiTotal = chiphiTotal;
    }

    public TourChiphiEntityId getId() {
        return id;
    }

    public void setId(TourChiphiEntityId id) {
        this.id = id;
    }
}