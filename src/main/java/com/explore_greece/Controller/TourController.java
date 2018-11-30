package com.explore_greece.Controller;

import com.explore_greece.Model.Tour;
import com.explore_greece.Repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TourController {

    @Autowired
    private TourRepository tourRepository;

    //Fetches all tours
    @GetMapping("/tours")
    public List<Tour> findAllTours(){
        return tourRepository.findAll();
    }

    @GetMapping("/tours/{id}")
    public Optional<Tour> getTourById(@PathVariable Long id){
        return tourRepository.findById(id);
    }

    /*//get tour package id, then get all tours inside
    @GetMapping("/tour-packages/{package-id}/tours")
    public Optional<Tour> getAllToursByTourPackageId(@PathVariable(value = "package-id") Long packageId){
        return tourRepository.findByTourPackageId(packageId);
    }*/

}
