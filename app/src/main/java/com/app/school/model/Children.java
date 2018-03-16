package com.app.school.model;

import lombok.Data;

/**
 * Created by Avik on 16-03-2018.
 */

public class Children {

    public String name;
    public String image;
    public String lat;
    public String lng;

    public Children(String name, String image, String lat, String lng) {
        this.name = name;
        this.image = image;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
