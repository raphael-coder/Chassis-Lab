package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

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
                new Date(2012, 1, 7, 7, 13, 19),
                "H-Series", "H23A1", "", 4, "88 AKI", "2WD: Two-Wheel Drive");

        System.out.println(manufacturedEngine);

        Vehicle vehicleDefault = new Vehicle();
        System.out.println(vehicleDefault);

        Vehicle vehicle = new Vehicle("Honda", new Date(2012, 1, 3, 7, 13, 19), "Honda",
                "H-Series", 4, "88 AKI", "2WD: Two-Wheel Drive");
        System.out.println(vehicle);

    }
}