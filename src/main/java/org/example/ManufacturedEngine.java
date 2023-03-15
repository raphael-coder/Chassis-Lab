package org.example;

import java.util.Date;

public class ManufacturedEngine implements Engine {

    private String engineManufacturer;

    private Date engineManufactureDate;

    private String engineMake;

    private String engineModel;

    private String engineDriveTrain;

    private int engineCylinders;

    private String engineType;

    private String driveTrain;

    public ManufacturedEngine() {
        this.engineManufacturer = "Generic";
        this.engineManufactureDate = new Date(2012, 2,2,0,55,44);
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineDriveTrain = "Generic";
        this.engineCylinders = 0;
        this.engineType = "85 AKI";
        this.driveTrain = "2WD: Two-Wheel Drives";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufactureDate, String engineMake, String engineModel, String engineDriveTrain, int engineCylinders, String engineType, String driveTrain) {
        this.engineManufacturer = engineManufacturer;
        this.engineManufactureDate = engineManufactureDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineDriveTrain = engineDriveTrain;
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
        this.engineManufactureDate = date;
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

    @Override
    public String toString() {
        return "ManufacturedEngine{" +
                "Engine Manufacturer : '" + engineManufacturer + '\'' + "\n" +
                "Engine Manufactured : " + engineManufactureDate + "\n" +
                "Engine Make : '" + engineMake + '\'' + "\n" +
                "Engine Model : '" + engineModel + '\'' + "\n" +
                "Engine Type : '" + engineDriveTrain + '\'' + "\n" +
                "Engine Cylinders : " + engineCylinders + "\n" +
                "Engine Type : '" + engineType + '\'' + "\n" +
                "Drive Train : '" + driveTrain + '\'' + "\n" +
                '}';
    }
}
