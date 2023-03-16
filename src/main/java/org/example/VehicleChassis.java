package org.example;

public class VehicleChassis implements Chassis {

    String chassisName;

    public VehicleChassis() {
        this.chassisName = "Unibody";
    }

    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }


    @Override
    public VehicleChassis getChassisType() {
        return new VehicleChassis(this.chassisName);
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        this.chassisName = vehicleChassis;
    }

    @Override
    public String toString() {
        return "Chassis Name: " + chassisName;
    }

    public static void main(String[] args) {
        VehicleChassis defaultChassis = new VehicleChassis();
        System.out.println(defaultChassis);

        VehicleChassis customChassis = new VehicleChassis("Sport");
        System.out.println(customChassis);
    }
}
