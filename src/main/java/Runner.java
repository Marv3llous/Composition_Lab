import garage.air.Helicopter;
import garage.air.Plane;
import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.Speedboat;

public class Runner {

    public static void main(String[] args) {
    IEngine combustionEngine = new CombustionEngine(99, "01/01/2024");
    Car hondaJazz = new Car(1300, 150, 99, "hatchback", combustionEngine);
        System.out.println(hondaJazz.getHorsePower());


        IEngine electricEngine = new ElectricEngine(399, 100);
        hondaJazz.setEngine(electricEngine);
        System.out.println(hondaJazz.getHorsePower());



        IEngine combustionEngine1 = new CombustionEngine(99, "14/02/2024");
        Speedboat speedboat = new Speedboat(30.5f, 55, false, combustionEngine);
        System.out.println(speedboat.getHorsePower());

        IEngine electricEngine1 = new ElectricEngine(300, 100);
        speedboat.setEngine(electricEngine1);
        System.out.println(speedboat.getHorsePower());


        Plane plane = new Plane(300f, 300, "Primary", 2);
        System.out.println(plane.getNumberOfWings());
        System.out.println(plane.getRadarType());


        Helicopter helicopter = new Helicopter(200, 200, "blade", "Secondary");
        System.out.println(helicopter.getRadarType());
        System.out.println(helicopter.getRotorType());

    }




}
