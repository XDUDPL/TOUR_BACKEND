package com.lpwanw.tour.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tour_khachhang")
@Entity
public class KhachhangEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kh_id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "kh_ten", nullable = false)
    private String khTen;

    @Lob
    @Column(name = "kh_sdt", nullable = false)
    private String khSdt;

    @Column(name = "kh_ngaysinh", nullable = false)
    private LocalDate khNgaysinh;

    @Lob
    @Column(name = "kh_email", nullable = false)
    private String khEmail;

    @Lob
    @Column(name = "kh_cmnd", nullable = false)
    private String khCmnd;

    public String getKhCmnd() {
        return khCmnd;
    }

    public void setKhCmnd(String khCmnd) {
        this.khCmnd = khCmnd;
    }

    public String getKhEmail() {
        return khEmail;
    }

    public void setKhEmail(String khEmail) {
        this.khEmail = khEmail;
    }

    public LocalDate getKhNgaysinh() {
        return khNgaysinh;
    }

    public void setKhNgaysinh(LocalDate khNgaysinh) {
        this.khNgaysinh = khNgaysinh;
    }

    public String getKhSdt() {
        return khSdt;
    }

    public void setKhSdt(String khSdt) {
        this.khSdt = khSdt;
    }

    public String getKhTen() {
        return khTen;
    }

    public void setKhTen(String khTen) {
        this.khTen = khTen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}