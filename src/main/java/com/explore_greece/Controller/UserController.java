package com.explore_greece.Controller;

import com.explore_greece.Model.User;
import com.explore_greece.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("index/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/")
    public User createUser(@Valid @RequestBody User user) {
        // This is important to synchronize both sides of the relationship
        user.getUserProfile().setUser(user);

        return userRepository.save(user);
    }
    /*//Create a new User
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){

        return userRepository.save(user);
    }*/

    //Find all users
    @GetMapping
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    //Find a user by their ID
    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable(value = "id") Long userId){
        return userRepository.findById(userId);
    }

    //Update a user by their ID
    @PutMapping("{id}")
    public User updateUser(@PathVariable (name = "id") Long id,
                           @RequestBody User updatedUser){

        return userRepository.save(updatedUser);
    }

    //Delete a user by their ID
    @DeleteMapping("{id}")
    public void delete(@PathVariable (name = "id") Long userId) {
        userRepository.deleteById(userId);
    }
}
