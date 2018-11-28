package com.explore_greece.Controller;

import com.explore_greece.Model.Tour;
import com.explore_greece.Repository.TourPackageRepository;
import com.explore_greece.Repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TourController {

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private TourPackageRepository tourPackageRepository;

    //Fetches all tours
    @GetMapping
    public List<Tour> findAllTours(){
        return tourRepository.findAll();
    }

    //get tour package id, then get all tours inside
    @GetMapping("/tour-packages/{package-id}/tours")
    public List<Tour> getAllToursByTourPackageId(
            @PathVariable (value = "package-id") Long packageId){
        return tourRepository.findByTourPackageId(packageId);
    }


   /* //fetches a tour by its id
    @GetMapping("/{id}")
    public Optional<Tour> getById(@PathVariable(value = "id") Long id){ //
        return tourRepository.findById(id);
    }*/

}
