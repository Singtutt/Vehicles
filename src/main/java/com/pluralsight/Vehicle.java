package com.pluralsight;

public class Vehicle {
//  Side note: Durability property?
    private String color;
    private int fuelCapacity;
    private int seatCapacity;
    private int cargoCapacity;
    private int speed;

    public Vehicle(String color, int fuelCapacity, int seatCapacity, int cargoCapacity, int speed) {
        this.color = color;
        this.fuelCapacity = fuelCapacity;
        this.seatCapacity = seatCapacity;
        this.cargoCapacity =cargoCapacity;
        this.speed = speed;
    }

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

//  Main()...
    public static void main(String[] args) {
        Moped myMoped = new Moped("Red", 10, 2, 25, 35, "Type A");
        System.out.println("Testing Moped:\n\tVehicle color: " + myMoped.getColor() + "\n\tSeat Capacity: " + myMoped.getSeatCapacity() + "\n\tCargo Capacity: " + myMoped.getCargoCapacity() + "\n\tSpeed (mph): " + myMoped.getSpeed() + "\n\tMoped Type: " + myMoped.getType());

        Car myCar = new Car("Violet", 35, 5, 100, 120, "Model A");
        System.out.println("\nTesting Car:\n\tVehicle color: " + myCar.getColor() + "\n\tSeat Capacity: " + myCar.getSeatCapacity() + "\n\tCargo Capacity: " + myCar.getCargoCapacity() + "\n\tSpeed (mph): " + myCar.getSpeed() + "\n\tCar Type: " + myCar.getModel());

        SemiTruck mySemiTruck = new SemiTruck("Blue", 100, 2, 1000, 80, true);
        System.out.println("\nTesting SemiTruck:\n\tVehicle color: " + mySemiTruck.getColor() + "\n\tSeat Capacity: " + mySemiTruck.getSeatCapacity() + "\n\tCargo Capacity: " + mySemiTruck.getCargoCapacity() + "\n\tSpeed (mph): " + mySemiTruck.getSpeed() + "\n\tIs trailer attached: " + mySemiTruck.isTrailerAttached());

        Hovercraft myHovercraft = new Hovercraft("Green", 50, 8, 400, 55, true, true);
        System.out.println("\nTesting Hovercraft:\n\tVehicle color: " + myHovercraft.getColor() + "\n\tSeat Capacity: " + myHovercraft.getSeatCapacity() + "\n\tCargo Capacity: " + myHovercraft.getCargoCapacity() + "\n\tSpeed (mph): " + myHovercraft.getSpeed() + "\n\tWater-Resistance De-Buff Activated: " + myHovercraft.verifyWaterResistance() + "\n\tVerify Afloat Function: " + myHovercraft.isAfloat());
    }
}
