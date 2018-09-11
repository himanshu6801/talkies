/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deltax.talkies.model;

import java.util.List;

/**
 *
 * @author Himanshu
 */
public class MovieDetails {
    
    private Movie movie;
    private Producer producer;
    private List<Actor> actors;

    public MovieDetails(Movie movie, Producer producer, List<Actor> actors) {
        this.movie = movie;
        this.producer = producer;
        this.actors = actors;
    }

    
    
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "MovieDetails{" + "movie=" + movie + ", producer=" + producer + ", actors=" + actors + '}';
    }
    
    
    
}
