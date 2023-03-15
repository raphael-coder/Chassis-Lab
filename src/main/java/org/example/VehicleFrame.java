package org.example;

public class VehicleFrame implements Chassis {

    private String vehicleFrameType;

    public VehicleFrame() {
        this.vehicleFrameType = "Unibody";

    }

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public VehicleFrame getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String toString() {
        return "VehicleFrame{" + "\n" +
                "Chassis :'" + chassis + '\'' + "\n" +
                "Vehicle Frame :'" + vehicleFrameType + '\'' + "\n" +
                '}';
    }
}
