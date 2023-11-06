package com.pluralsight;

public class Moped extends Vehicle{
    private String type;

    public Moped(String color, int fuelCapacity, int seatCapacity, int cargoCapacity, int speed, String type) {
        super(color, fuelCapacity, seatCapacity, cargoCapacity, speed);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
