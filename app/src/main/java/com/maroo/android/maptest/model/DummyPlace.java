package com.maroo.android.maptest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DummyPlace {
    int id;
    private String title;
    private Double lat;
    private Double lng;

    public DummyPlace(int id,String title, Double lat, Double lng) {
        this.id = id;
        this.title = title;
        this.lat = lat;
        this.lng = lng;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
