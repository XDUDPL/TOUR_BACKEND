package com.lpwanw.tour.Mapper;

import com.lpwanw.tour.DTO.TourDTO;
import com.lpwanw.tour.Entity.TourEntity;

public class TourEntityToTourDTO {

    public TourDTO EntityToDto(TourEntity entity){
        TourDTO tourDTO = new TourDTO();
        tourDTO.setId( entity.getId());
        tourDTO.setTourTen(entity.getTourTen());
        tourDTO.setTourMoTa(entity.getTourMota());
        tourDTO.setTenLoai(entity.getLoai().getLoaiTen());
        tourDTO.setMoTaLoai(entity.getLoai().getLoaiMota());
        return tourDTO;
    }

}
