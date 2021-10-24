package com.lpwanw.tour.DTO;

public class TourDTO {
    private Integer id;
    private String tourTen;
    private String tourMoTa;
    private String tenLoai;
    private String moTaLoai;
    private Integer idLoai;

    public Integer getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(Integer idLoai) {
        this.idLoai = idLoai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTourTen() {
        return tourTen;
    }

    public void setTourTen(String tourTen) {
        this.tourTen = tourTen;
    }

    public String getTourMoTa() {
        return tourMoTa;
    }

    public void setTourMoTa(String tourMoTa) {
        this.tourMoTa = tourMoTa;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMoTaLoai() {
        return moTaLoai;
    }

    public void setMoTaLoai(String moTaLoai) {
        this.moTaLoai = moTaLoai;
    }
}
