package com.lpwanw.tour.Controller;

import com.lpwanw.tour.Entity.TourLoaiEntity;
import com.lpwanw.tour.Reponsitoty.TourLoaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/tour_loai")
public class TourLoaiServiceController {
    @Autowired
    TourLoaiRepository loaiRepository;
    @GetMapping(value = "/get")
    public List<TourLoaiEntity> getAll(){
        return loaiRepository.findAll();
    }
}
