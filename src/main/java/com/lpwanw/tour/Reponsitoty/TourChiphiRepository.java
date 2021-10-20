package com.lpwanw.tour.Reponsitoty;

import com.lpwanw.tour.Entity.TourChiphiEntity;
import com.lpwanw.tour.Entity.TourChiphiEntityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourChiphiRepository extends JpaRepository<TourChiphiEntity, TourChiphiEntityId> {
}