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
    public String getChassisType() {
        return chassisName;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        this.chassisName = vehicleChassis;
    }

    @Override
    public String toString() {
        return "VehicleChassis{" +
                "chassisName='" + chassisName + '\'' +
                '}';
    }
}
