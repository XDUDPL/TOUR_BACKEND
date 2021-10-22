package com.lpwanw.tour.Controller;

import com.lpwanw.tour.DTO.TourDTO;
import com.lpwanw.tour.Entity.TourEntity;
import com.lpwanw.tour.Service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/tour")
public class TourRestController {
    @Autowired
    private TourService tourService;
    @GetMapping(value = "")
    public List<TourDTO> getAll(){
        return tourService.GetTour();
    }
}
