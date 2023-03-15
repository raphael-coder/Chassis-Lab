package org.example;

public class VehicleFrame implements Chassis {

    String vehicleFrameType;

    public VehicleFrame() {
        vehicleFrameType = "Unibody";
    }

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String getChassisType() {
        return this.getClass().toString();
    }

    @Override
    public void setChassisType(String vehicleFrameType) {

    }
}
