package com.lpwanw.tour.Reponsitoty;

import com.lpwanw.tour.Entity.TourChitietEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TourChitietRepository extends JpaRepository<TourChitietEntity, Integer> {
    @Query(value = "select c from TourChitietEntity c where c.tour.id = :id")
    List<TourChitietEntity> findByTourID(Integer id);

    @Query(value = "delete from TourChitietEntity c where c.tour.id = :tourID")
    void DeleteByTourID(Integer tourID);

}