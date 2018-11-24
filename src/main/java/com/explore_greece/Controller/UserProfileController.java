package com.explore_greece.Controller;


import com.explore_greece.Model.UserProfile;
import com.explore_greece.Repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
//@RequestMapping("index/user_profile") TODO implement Spring Security
public class UserProfileController {

    @Autowired
    private UserProfileRepository userProfileRepository;

    /**
     * TODO:The URI will be changed to ("index/user_profile").
     * The entire API will be behind an authentication gate(OAuth hopefully)
     * When the api user calls this endpoint, the user will require
     * authentication credentials which are linked to a user account
     * So this, will be a secure area in the future.
     */
    @GetMapping("/index/users/{id}/user_profile/{profile_id}")
    Optional<UserProfile> getUserProfileById(@PathVariable(name = "profile_id") Long id){
        return userProfileRepository.findById(id);
    }





}
