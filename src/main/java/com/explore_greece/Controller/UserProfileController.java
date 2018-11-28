package com.explore_greece.Controller;


import com.explore_greece.Model.UserProfile;
import com.explore_greece.Repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
/**
 * To access profile, we need to implement security.
 * This will change in the future. Profiles need authorization.
 */

@RestController
@RequestMapping("/user-profile")
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
    @GetMapping("/{id}")
    public Optional<UserProfile> getUserProfileById(@PathVariable(name = "id") Long id){
        return userProfileRepository.findById(id);
    }





}
