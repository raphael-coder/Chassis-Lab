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
        return new VehicleFrame(this.vehicleFrameType);
    }

    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String toString() {
        return "Chassis : " + this.getClass().getSimpleName() + "\n" + "Vehicle Frame : " + vehicleFrameType;
    }

    public static void main(String[] args) {
        VehicleFrame defaultFrame = new VehicleFrame();
        System.out.println(defaultFrame);

        VehicleFrame customFrame = new VehicleFrame("Sport");
        System.out.println(customFrame);
    }
}

