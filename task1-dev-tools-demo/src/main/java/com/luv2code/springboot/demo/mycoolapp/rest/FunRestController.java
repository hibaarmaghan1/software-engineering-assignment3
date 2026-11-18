package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello Hiba"

    @GetMapping("/")
    public String sayHello() {
        return "Hello Hiba!";
    }

    // expose a new endpoint for "movie"

    @GetMapping("/movie")
    public String getFavoriteMovie() {
        return "My favorite movie is Little Women";
    }

    // expose a new endpoint for "music"

    @GetMapping("/music")
    public String getFavoriteMusic() {
        return "My favorite music is indie pop";
    }

}






