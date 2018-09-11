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
public class Producer {
    
    private int producerid;
    String name;
    private char sex;
    private Date dob;
    private String bio;

    public Producer(int producerid, String name, char sex, Date dob, String bio) {
        this.producerid = producerid;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.bio = bio;
    }

    
    
    public int getProducerid() {
        return producerid;
    }

    public void setProducerid(int producerid) {
        this.producerid = producerid;
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
        return "Producer{" + "producerid=" + producerid + ", name=" + name + ", sex=" + sex + ", dob=" + dob + ", bio=" + bio + '}';
    }
    
}
