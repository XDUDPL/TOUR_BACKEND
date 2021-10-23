package com.lpwanw.tour.Service;

import com.lpwanw.tour.DTO.TourDTO;
import com.lpwanw.tour.Entity.TourEntity;
import com.lpwanw.tour.Mapper.TourEntityToTourDTO;
import com.lpwanw.tour.Reponsitoty.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public List<TourDTO> GetAll (){
        TourEntityToTourDTO tourEntityToTourDTO = new TourEntityToTourDTO();
        List<TourEntity> listTours = new ArrayList<>();
        listTours = tourRepository.findAll();
        List<TourDTO>  tourDTOS = new ArrayList<>();
        for(TourEntity tour:listTours){
            TourDTO tour1 = new TourDTO();
            tour1 = tourEntityToTourDTO.EntityToDto(tour);
            tourDTOS.add( tour1 );
        }
        return tourDTOS;
    }

    public Optional<TourEntity> GetTourById (Integer id){
        return tourRepository.findById(id);
    }

    public TourEntity InsertTour (TourEntity tourEntity){
        return tourRepository.save(tourEntity);
    }

    public TourEntity UpdateTour (TourEntity tourEntity){
        return tourRepository.save(tourEntity);
    }

    public void DeleteTour(Integer id){
        tourRepository.deleteById(id);
    }

}
