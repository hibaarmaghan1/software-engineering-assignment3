package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // show the initial HTML form (was "/showForm")
    @RequestMapping("/Movie")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // read form data and add data to the model (was "/processFormVersionTwo")
    @RequestMapping("/MovieName")
    public String processMovieName(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theMovie = request.getParameter("movieName");

        // create the message
        String result = theMovie + " is my favorite movie";

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}