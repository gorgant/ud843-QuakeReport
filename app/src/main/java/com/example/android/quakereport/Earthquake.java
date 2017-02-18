package com.example.android.quakereport;

import java.net.URL;

/**
 * Created by Ludeyu on 2/9/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    /** Time of the earthquake */
    private Long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake (double magnitude, String location, Long timeInMilliseconds, String url) {
        this.mMagnitude = magnitude;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mLocation = location;
        this.mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
