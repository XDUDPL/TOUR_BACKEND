package com.lpwanw.tour.Reponsitoty;

import com.lpwanw.tour.Entity.TourNguoidiEntity;
import com.lpwanw.tour.Entity.TourNguoidiEntityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourNguoidiRepository extends JpaRepository<TourNguoidiEntity, TourNguoidiEntityId> {
}