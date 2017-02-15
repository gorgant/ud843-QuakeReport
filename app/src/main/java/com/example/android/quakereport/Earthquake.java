package com.example.android.quakereport;

/**
 * Created by Ludeyu on 2/9/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake (double magnitude, String location, String date) {
        this.mMagnitude = magnitude;
        this.mDate = date;
        this.mLocation = location;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }



}
