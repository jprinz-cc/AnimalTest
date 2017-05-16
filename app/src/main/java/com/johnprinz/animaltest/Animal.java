package com.johnprinz.animaltest;

/**
 * Created by JP on 2017-05-16.
 */

public class Animal {

    // Some member variables
    public int age;
    public int weight;
    public String type;
    public int hungerLevel;
    public void eat(){
        hungerLevel--;
    }
    public void walk(){
        hungerLevel++;
    }

}
