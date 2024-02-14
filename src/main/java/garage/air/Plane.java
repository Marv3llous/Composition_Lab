package garage.air;

import garage.Vehicle;

public class Plane extends Vehicle implements IAirVehicle {

    private String radarType;
    private int numberOfWings;


    public Plane(float weight, int maxSpeed, String radarType, int numberOfWings){
        super(weight, maxSpeed);
        this.radarType = radarType;
        this.numberOfWings = numberOfWings;
    }

    public String getRadarType() {
        return radarType;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }
}
