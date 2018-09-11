/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deltax.talkies.controller;

import com.deltax.talkies.model.MovieDetails;
import com.deltax.talkies.service.ActorService;
import com.deltax.talkies.service.MovieService;
import com.deltax.talkies.service.ProducerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Himanshu
 */
@Controller
public class TalkiesController {

    @Autowired
    ActorService actorService;

    @Autowired
    MovieService movieService;

    @Autowired
    ProducerService producerService;

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

//-----------------------------------------------------REst Start's Here--------------------------------------
    @GetMapping("/allAccess")
    @ResponseBody
    public String allAccess() {
        return "Accessed by any User";
    }

    @GetMapping("/movies")
    @ResponseBody
    public List<MovieDetails> getAllMovies() {
        return movieService.getAllMovieDetails();
    }

    @PostMapping("/movie")
    @ResponseBody
    public void addMovie(@RequestBody String movie) {

    }

    @PutMapping("/movie")
    @ResponseBody
    public void updateMovie(@RequestBody String movie) {

    }

}
