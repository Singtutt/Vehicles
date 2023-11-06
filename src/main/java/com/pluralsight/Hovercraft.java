package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean waterResistance;
    private boolean isAfloat;

    public Hovercraft(int fuelCapacity, int seatCapacity, int cargoCapacity, int speed) {
        super.setFuelCapacity(fuelCapacity);
        super.setSeatCapacity(seatCapacity);
        super.setCargoCapacity(cargoCapacity);
        super.setSpeed(speed);
        this.waterResistance = false; // Resistance only on "rough" waters. Initially calm...
        this.isAfloat = false; // Initially docked. (Not afloat till it touches water)
    }
//  Getters...
    public boolean hasWaterResistance() { //  Minor slow-de-buff ("rough" waters)
        return waterResistance;
    }
    public boolean isAfloat() {
        return isAfloat;
    }
//  Setters...
    public void setWaterResistance(boolean waterResistance) {
        this.waterResistance = waterResistance;
    }
    public void setVehicleAfloat(boolean vehicleAfloat) {
        this.isAfloat = vehicleAfloat;
    }

    //  Unique function(s)..
    public void waterNavigation() {
        if (waterResistance) {
            isAfloat = true;
        } else {
            isAfloat = false;
        }
    }
}
