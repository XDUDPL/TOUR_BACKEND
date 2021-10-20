package com.lpwanw.tour.Controller;

import com.lpwanw.tour.Entity.TourEntity;
import com.lpwanw.tour.Reponsitoty.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class ToursServiceController {
    @Autowired
    TourRepository tourRepository;
    @GetMapping(value = "/get")
    public List<TourEntity> getAll(){
        return tourRepository.findAll();
    }
}
