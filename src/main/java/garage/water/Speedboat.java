package garage.water;

import garage.Vehicle;
import garage.engine.IEngine;

public class Speedboat extends Vehicle implements IWaterVehicle, IEngine {

    private boolean needsCrew;
    private String HullType;
    private IEngine engine;


    public Speedboat(float weight, int maxSpeed, boolean needsCrew, IEngine engine){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
        this.engine = engine;
    }

    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
    }

    @Override
    public String getHullType() {
        return HullType;
    }

    @Override
    public void setHullType(String hullType) {
        HullType = hullType;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
}
