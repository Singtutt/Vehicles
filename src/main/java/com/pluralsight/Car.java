package com.pluralsight;

public class Car extends Vehicle{
    private String model;

    public Car(String color, int fuelCapacity, int seatCapacity, int cargoCapacity,int speed, String model) {
        super(color, fuelCapacity, seatCapacity, cargoCapacity, speed);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
