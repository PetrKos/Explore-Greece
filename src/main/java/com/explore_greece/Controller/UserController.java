package com.explore_greece.Controller;

import com.explore_greece.Model.User;
import com.explore_greece.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //Find all users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //Find a user by their ID
    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable(value = "id") Long userId){
        return userRepository.findById(userId);
    }

    //Create a new User
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User newUser){
        userRepository.save(newUser);
    }

    //Update a user by their ID
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable (name = "id") Long id,
                           @RequestBody User updatedUser){

        return userRepository.save(updatedUser);
    }

    //Delete a user by their ID
    @DeleteMapping("users/{id}")
    public void delete(@PathVariable (name = "id") Long userId) {
        userRepository.deleteById(userId);
    }
}
