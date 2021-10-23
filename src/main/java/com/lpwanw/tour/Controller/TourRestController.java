package com.lpwanw.tour.Controller;

import com.lpwanw.tour.DTO.TourDTO;
import com.lpwanw.tour.Entity.KhachhangEntity;
import com.lpwanw.tour.Entity.TourEntity;
import com.lpwanw.tour.Service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/tour")
public class TourRestController {
    @Autowired
    private TourService tourService;
    @GetMapping(value = "")
    public List<TourDTO> getAll(){
        return tourService.GetAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TourEntity> getById(@PathVariable int id){
        Optional<TourEntity> kh = tourService.GetTourById(id);
        return kh.map(tourEntity -> new ResponseEntity<>(tourEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public TourEntity addOne(@RequestBody TourEntity tourEntity){
        return tourService.InsertTour(tourEntity);
    }

}
