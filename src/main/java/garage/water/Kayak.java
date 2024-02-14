package garage.water;

import garage.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle {

    private int numberOfPaddles;
    private String HullType;
    public Kayak(float weight, int maxSpeed){
        super(weight, maxSpeed);
        this.numberOfPaddles = 1;
    }

    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
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
