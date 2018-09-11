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
public class Actor {
    
    private int actorid;
    private String name;
    private char sex;
    private Date dob;
    private String bio;

    public Actor(int actorid, String name, char sex, Date dob, String bio) {
        this.actorid = actorid;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.bio = bio;
    }

    
    
    public int getActorid() {
        return actorid;
    }

    public void setActorid(int actorid) {
        this.actorid = actorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorid=" + actorid + ", name=" + name + ", sex=" + sex + ", dob=" + dob + ", bio=" + bio + '}';
    }
    
    
}

