package org.example;

public class InteriorFeature implements Feature {

    String interiorFeature;

    public InteriorFeature() {
        this.interiorFeature = "Generic";
    }

    public InteriorFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }

    @Override
    public String getFeature() {
        return interiorFeature;
    }

    @Override
    public void setFeature(String feature) {
        this.interiorFeature = feature;
    }

    @Override
    public String toString() {
        return "Interior [" + interiorFeature + "]";
    }

    public static void main(String[] args) {
        InteriorFeature feature1 = new InteriorFeature();
        System.out.println(feature1.toString());

        InteriorFeature feature2 = new InteriorFeature("Leather Seats");
        System.out.println(feature2.toString());
    }
}
