package garage.water;

import garage.Vehicle;

public class Pedalboat extends Vehicle implements IWaterVehicle {


    private int numberOfSeats;
    private String HullType;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String getHullType() {
        return HullType;
    }

    @Override
    public void setHullType(String hullType) {
        HullType = hullType;
    }
}
