package com.explore_greece.Controller;

import com.explore_greece.Model.TourPackage;
import com.explore_greece.Model.User;
import com.explore_greece.Repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tour-packages")
public class TourPackageController {

    @Autowired
    private TourPackageRepository tourPackageRepository;

    //Get all users
    @GetMapping
    public List<TourPackage> availableTourPackages() {

        return tourPackageRepository.findAll();
    }


}



