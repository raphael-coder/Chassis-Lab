package org.example;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        VehicleChassis vehicleChassisNoArgs = new VehicleChassis();
        VehicleChassis vehicleChassis = new VehicleChassis("Heavy");

        System.out.println(vehicleChassisNoArgs.toString());
        System.out.println(vehicleChassis.toString());


        VehicleFrame vehicleFrameNoArgs = new VehicleFrame();

        System.out.println(vehicleFrameNoArgs);

        VehicleFrame vehicleFrame = new VehicleFrame("Unibody");
        System.out.println(vehicleFrame);

        ManufacturedEngine manufacturedEngineDefault = new ManufacturedEngine();
        System.out.println(manufacturedEngineDefault);
        ManufacturedEngine manufacturedEngine = new ManufacturedEngine("Honda",
                Date.valueOf(LocalDateTime.of(2012, 1, 7, 7, 13, 19).toString()),
                "H-Series", "H23A1", "", 4, "88 AKI", "2WD: Two-Wheel Drive");
    }
}