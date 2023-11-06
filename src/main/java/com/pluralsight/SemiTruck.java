package com.pluralsight;

public class SemiTruck extends Vehicle{
    private boolean trailerAttached;

    public SemiTruck(String color, int fuelCapacity, int seatCapacity, int cargoCapacity, int speed, boolean trailerAttached) {
        super(color, fuelCapacity, seatCapacity, cargoCapacity, speed);
        this.trailerAttached = trailerAttached;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }
    public void attachTrailer() {
        trailerAttached = true;
    }
    public void detachTrailer() {
        trailerAttached = false;
    }
    public void trailerOption() {
        if (trailerAttached) {
            detachTrailer();
        } else {
            attachTrailer();
        }
    }
}
