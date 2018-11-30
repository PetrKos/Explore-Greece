package com.explore_greece.Controller;

import com.explore_greece.Model.TourPackage;
import com.explore_greece.Repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class TourPackageController {

    @Autowired
    private TourPackageRepository tourPackageRepository;

    //Find all tour packages
    @GetMapping("/tour-packages")
    public List<TourPackage> getAllTourPackages() {
        return tourPackageRepository.findAll();
    }

    //Finds a tour package by id
    @GetMapping("tour-packages/{id}")
    public Optional<TourPackage> GetTourPackageById(@PathVariable(value = "id") Long id){
        return tourPackageRepository.findById(id);
    }

    //Just for demonstration, no need to implement any other HTTP verb for now
}



