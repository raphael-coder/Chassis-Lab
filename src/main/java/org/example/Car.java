package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {
    private Feature[] features = new Feature[10];
    private int carAxle;

    public Car() {
        super();
        this.carAxle = 1;
        features[0] = new InteriorFeature("No Interior Features");
        features[1] = new ExteriorFeature("No Exterior Features");
    }

    public Car(String engineManufacturer, Date engineManufactureDate, String engineMake, String engineModel, int engineCylinders, String engineType, String driveTrain, Feature[] features, int carAxle) {
        super(engineManufacturer, engineManufactureDate, engineMake, engineModel, engineCylinders, engineType, driveTrain);
        this.features = features;
        this.carAxle = carAxle;
    }

    public String getExteriorFeatures() {
        String printTitle = "Exterior Features";

        return printTitle + Arrays
                .toString(Arrays
                        .stream(features)
                        .filter(feature -> feature instanceof ExteriorFeature)
                        .toArray());
    }

    public String getInteriorFeatures() {
        String printTitle = "Interior Features";

        return printTitle + Arrays
                .toString(Arrays
                        .stream(features)
                        .filter(feature -> feature instanceof InteriorFeature)
                        .toArray());
    }

    @Override
    public String toString() {
        String featureList = "";
        for (int i = 0; i < features.length; i++) {
            if (features[i] != null) {
                featureList += features[i].toString() + "\n" + " : ";
            }
        }
        return super.toString() + "\nFeatures : " + featureList.substring(0, featureList.length() - 3) + "\nCar Axle : "
                + this.carAxle;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        System.out.println();
        System.out.println("Exterior Features : " + car1.getExteriorFeatures());
        System.out.println();

        System.out.println("Interior Features : " + car1.getInteriorFeatures());

        Feature[] features = new Feature[10];
        features[0] = new InteriorFeature("AM/FM Radio");
        features[1] = new ExteriorFeature("Wood Panels");
        features[2] = new InteriorFeature("Air Conditioning");
        features[3] = new ExteriorFeature("Moonroof");

        Chassis chassis = new VehicleFrame("Unibody");
        Engine engine = new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1",
                "", 4, "88 AKI", "2WD: Two-Wheel Drive"
                );

        Car car2 = new Car("Honda", new Date(1325581999000L), "Honda", "Prelude", 4,  "engine", "chassis",
                features, 2);
        System.out.println(car2);
        System.out.println();
        System.out.println("Exterior Features : " + car2.getExteriorFeatures());
        System.out.println();
        System.out.println("Interior Features : " + car2.getInteriorFeatures());
    }
}
