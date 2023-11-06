package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean waterResistance;
    private boolean isAfloat;

    public Hovercraft(String color, int fuelCapacity, int seatCapacity, int cargoCapacity, int speed, boolean waterResistance, boolean isAfloat) {
        super(color, fuelCapacity, seatCapacity, cargoCapacity, speed);
        this.waterResistance = waterResistance;
        this.isAfloat = isAfloat;
    }

//  Getters...
    public boolean verifyWaterResistance() { //  Minor slow-de-buff
        return waterResistance;
    }
    public boolean isAfloat() {
        return isAfloat;
    }
//  Setters...
    public void setWaterResistance(boolean waterResistance) {
        this.waterResistance = waterResistance;
    }
    public void setIsAfloat(boolean isAfloat) {
        this.isAfloat = isAfloat;
    }
}
