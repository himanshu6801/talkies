/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deltax.talkies.model;

import java.util.Date;

/**
 *
 * @author Himanshu
 */
public class Movie {
    
    private int movieid;
    private String name;
    private Date year;
    private String plot;
    private int producerid;
    private String poster;

    public Movie(int movieid, String name, Date year, String plot, int producerid, String poster) {
        this.movieid = movieid;
        this.name = name;
        this.year = year;
        this.plot = plot;
        this.producerid = producerid;
        this.poster = poster;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public int getProducerid() {
        return producerid;
    }

    public void setProducerid(int producerid) {
        this.producerid = producerid;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Movie{" + "movieid=" + movieid + ", name=" + name + ", year=" + year + ", plot=" + plot + ", producerid=" + producerid + ", poster=" + poster + '}';
    }
    
    
    
    
}
