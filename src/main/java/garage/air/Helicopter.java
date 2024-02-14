package garage.air;

import garage.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle {

    private String rotorType;
    private String radarType;

    public Helicopter (float weight, int maxSpeed, String rotorType, String radarType){
        super(weight, maxSpeed);
        this.rotorType = rotorType;
        this.radarType = radarType;
    }

    public String getRotorType() {
        return rotorType;
    }

    public void setRotorType(String rotorType) {
        this.rotorType = rotorType;
    }

    public String getRadarType() {
        return radarType;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }
}
