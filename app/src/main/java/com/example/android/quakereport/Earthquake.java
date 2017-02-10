package com.example.android.quakereport;

/**
 * Created by Ludeyu on 2/9/2017.
 */

public class Earthquake {

    private double magnitude;
    private String location;
    private String date;

    public Earthquake (double magnitude, String location, String date) {
        this.magnitude = magnitude;
        this.date = date;
        this.location = location;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }



}
