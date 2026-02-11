package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }

    public String getCity() {
        return city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    String getProvinceName(){
        return this.province;

    }

}