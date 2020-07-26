package com.example.appdz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Season {

    @SerializedName("time_of_year")
    @Expose
    private String timeOfYear;
    @SerializedName("year")
    @Expose
    private Integer year;

    public String getTimeOfYear() {
        return timeOfYear;
    }

    public void setTimeOfYear(String timeOfYear) {
        this.timeOfYear = timeOfYear;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}