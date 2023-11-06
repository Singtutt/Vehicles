package com.pluralsight;

public class Vehicle {
//  Side note: Durability property?
    private String color;
    private int fuelCapacity;
    private int seatCapacity;
    private int cargoCapacity;
    private int speed;

//  Outlier methods...
    public void brake() {

    }
    public void acceleration() {

    }
    public void refuel() {

    }
//  Getters needed...
    public String getColor() {
        return color;
    }
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public int getSpeed() {
        return speed;
    }

//  Setters needed...
    public void setColor(String color) {
        this.color = color;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public static void main(String[] args) {
        Moped myMoped = new Moped();
        myMoped.setColor("Red");
        myMoped.setFuelCapacity(5);
        myMoped.setType("Type A"); // TBD on irl brands
        myMoped.honkHorn();

        Car myCar = new Car();
        myCar.setColor("Purple");
        myCar.setSeatCapacity(4);
        myCar.setModel("Model A"); // TBD on irl brands
        myCar.musicOption();

        SemiTruck mySemiTruck = new SemiTruck();
        mySemiTruck.setColor("Blue");
        mySemiTruck.setSpeed(50);
        mySemiTruck.setCargoCapacity(2500);
        mySemiTruck.trailerOption();
        mySemiTruck.loadCargo();

        Hovercraft myHovercraft = new Hovercraft();
        myHovercraft.setColor("");
        myHovercraft.setFuelCapacity(70);
        myHovercraft.setWaterResistance();
        myHovercraft.setVehicleAfloat(true);
        myHovercraft.();
    }
}
