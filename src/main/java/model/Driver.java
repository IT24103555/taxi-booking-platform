package com.example.taxi.model;

public class Driver {
    private String id;
    private String name;
    private String vehicle;
    private double rating;

    
    public Driver(String id, String name, String vehicle, double rating) {
        this.id = id;
        this.name = name;
        this.vehicle = vehicle;
        this.rating = rating;
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVehicle() {
        return vehicle;
    }

    public double getRating() {
        return rating;
    }

   
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

   
    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", rating=" + rating +
                '}';
    }
}
