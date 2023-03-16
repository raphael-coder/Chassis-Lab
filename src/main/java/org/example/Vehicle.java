package org.example;

import java.util.Date;

public class Vehicle implements Engine {

    private String engineManufacturer;

    private Date engineManufacturedDate;

    private String engineMake;

    private String engineModel;

    private int engineCylinders;

    private String engineType;

    private String driveTrain;

    public Vehicle() {
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineCylinders = 0;
        this.engineType = "88 AKI";
        this.driveTrain = "2WS: Two-Wheel Drive";
    }

    public Vehicle(String engineManufacturer, Date engineManufacturedDate, String engineMake, String engineModel, int engineCylinders, String engineType, String driveTrain) {
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }




    public String toString() {
        return "Manufacturer Name : " + engineManufacturer + "\n" +
                "Manufactured Date : " + engineManufacturedDate.toString() + "\n" +
                "Vehicle Make : " + engineMake + "\n" +
                "Vehicle Model : " + engineModel + "\n" +
                "Vehicle Type : None\n" +
                "Engine Manufacturer : " + engineManufacturer + "\n" +
                "Engine Manufactured : " + engineManufacturedDate.toString() + "\n" +
                "Engine Make : " + engineMake + "\n" +
                "Engine Model : " + engineModel + "\n" +
                "Engine Type : " + engineType + "\n" +
                "Engine Cylinders : " + engineCylinders + "\n" +
                "Drive Train : " + driveTrain;
    }

    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle();
        System.out.println(genericVehicle.toString());

        Vehicle vehicle = new Vehicle("Honda", new Date(2012, 1, 3, 7, 13, 19), "Honda",
                "H-Series", 4, "88 AKI", "2WD: Two-Wheel Drive");
        System.out.println(vehicle);
    }


}
