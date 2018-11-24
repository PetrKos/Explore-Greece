package com.explore_greece.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @GetMapping("/index")
    public String helloMessage(){
        return "Welcome aboard user!";
    }
}
