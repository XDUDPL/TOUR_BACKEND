package com.lpwanw.tour.Controller;

import com.lpwanw.tour.Entity.KhachhangEntity;
import com.lpwanw.tour.Reponsitoty.KhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/khachhang")
public class KhachHangServiceContoller {
    @Autowired
    KhachhangRepository khachhangRepository;
    @PostMapping("/add")
    public KhachhangEntity addOne(@RequestBody KhachhangEntity khachhangEntity){
        return khachhangRepository.save(khachhangEntity);
    }
    @GetMapping("/get/{id}")
    public KhachhangEntity getById(@PathVariable int id){
        return  khachhangRepository.findById(id).get();
    }
}
