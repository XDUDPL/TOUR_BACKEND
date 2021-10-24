package com.lpwanw.tour.Controller;


import com.lpwanw.tour.Entity.KhachhangEntity;
import com.lpwanw.tour.Entity.TourChitietEntity;
import com.lpwanw.tour.Entity.TourGiaEntity;
import com.lpwanw.tour.Reponsitoty.TourGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@RestController
@RequestMapping("/api/tourgia")
public class TourGiaController {
@Autowired
    TourGiaRepository tourgiaRepository;
    @GetMapping ("")
    public List<TourGiaEntity> getAll(){return tourgiaRepository.findAll();}
    @GetMapping("/{id}")
    public ResponseEntity<TourGiaEntity> getById(@PathVariable int id){
        Optional<TourGiaEntity> gia = tourgiaRepository.findById(id);
        return gia.map(tourChitietEntity -> new ResponseEntity<>(tourChitietEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("")
    public TourGiaEntity addOne(@RequestBody TourGiaEntity tourgiaEntity){
       int id = tourgiaRepository.save(tourgiaEntity).getId();
       return tourgiaRepository.getById(id);
    }
    @PutMapping("/{id")
    public ResponseEntity<TourGiaEntity> update(@PathVariable int id, @RequestBody TourGiaEntity tourgiaEntity){
        Optional<TourGiaEntity> gia = tourgiaRepository.findById(id);
        if(gia.isPresent()){
            return new ResponseEntity<>(tourgiaRepository.save(tourgiaEntity), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<TourGiaEntity> delete(@PathVariable int id){
        Optional<TourGiaEntity> gia = tourgiaRepository.findById(id);
        if(gia.isPresent()){
           tourgiaRepository.delete(gia.get());
            return new ResponseEntity<>(gia.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
