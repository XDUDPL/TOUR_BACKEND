package com.lpwanw.tour.Controller;

import com.lpwanw.tour.Entity.KhachhangEntity;
import com.lpwanw.tour.Reponsitoty.KhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/khachhangs")
public class KhachHangServiceContoller {
    @Autowired
    KhachhangRepository khachhangRepository;
    @PostMapping("")
    public KhachhangEntity addOne(@RequestBody KhachhangEntity khachhangEntity){
        int id = khachhangRepository.save(khachhangEntity).getId();
        return khachhangRepository.getById(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<KhachhangEntity> getById(@PathVariable int id){
        Optional<KhachhangEntity> kh = khachhangRepository.findById(id);
        return kh.isPresent()?new ResponseEntity<>(kh.get(), HttpStatus.OK):new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("")
    public List<KhachhangEntity> getAll(){
        return khachhangRepository.findAll();
    }
    @PutMapping("")
    public ResponseEntity<KhachhangEntity> update(@RequestBody KhachhangEntity khachhangEntity){
        Optional<KhachhangEntity> kh = khachhangRepository.findById(khachhangEntity.getId());
        if(kh.isPresent()){
            return new ResponseEntity<>(khachhangRepository.save(khachhangEntity), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<KhachhangEntity> delete(@PathVariable int id){
        Optional<KhachhangEntity> kh = khachhangRepository.findById(id);
        if(kh.isPresent()){
            khachhangRepository.delete(kh.get());
            return new ResponseEntity<>(kh.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
