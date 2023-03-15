package org.example;

public class Main {
    public static void main(String[] args) {
        VehicleChassis vehicleChassisNoArgs = new VehicleChassis();
        VehicleChassis vehicleChassis = new VehicleChassis("Heavy");

        System.out.println(vehicleChassisNoArgs.toString());
        System.out.println(vehicleChassis.toString());
    }
}