package com.lpwanw.tour.Reponsitoty;

import com.lpwanw.tour.Entity.KhachhangEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachhangRepository extends JpaRepository<KhachhangEntity, Integer> {
}