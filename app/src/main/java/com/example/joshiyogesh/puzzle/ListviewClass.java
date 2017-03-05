package com.example.joshiyogesh.puzzle;

/**
 * Created by Joshi Yogesh on 25/02/2017.
 */

public class ListviewClass {
    int resoureces_image;
    String country_name;

    public ListviewClass(int resoureces_image, String country_name) {
        super();
       this.setCountry_name(country_name);
        this.setResoureces_image(resoureces_image);
    }

    public String getCountry_name() {
        return country_name;
    }

    public int getResoureces_image() {
        return resoureces_image;
    }

    public void setResoureces_image(int resoureces_image) {
        this.resoureces_image = resoureces_image;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
