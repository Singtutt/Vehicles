package com.pluralsight;

public class SemiTruck extends Vehicle{
    private boolean trailerAttached;

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

    //  Unique function(s)...
    public void loadCargo() {

    }
}
