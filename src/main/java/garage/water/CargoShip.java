package garage.water;

import garage.Vehicle;
import garage.engine.IEngine;

public class CargoShip extends Vehicle implements IWaterVehicle, IEngine {

    private int numberOfContainers;
    private String HullType;

    private IEngine engine;

    public CargoShip(float weight, int maxSpeed, int numberOfContainers, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.engine = engine;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public String getHullType() {
        return HullType;
    }

    @Override
    public void setHullType(String hullType) {
        HullType = hullType;
    }

    @Override
    public int getHorsePower() {
        return  this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }
}
