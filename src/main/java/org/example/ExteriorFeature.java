package org.example;

public class ExteriorFeature implements Feature {
    String exteriorFeature;

    public ExteriorFeature() {
        this.exteriorFeature = "Generic";
    }

    public ExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    @Override
    public String getFeature() {
        return this.exteriorFeature;
    }

    @Override
    public void setFeature(String feature) {
        this.exteriorFeature = feature;
    }

    @Override
    public String toString() {
        return "ExteriorFeature{" +
                "Exterior :'" + exteriorFeature + '\'' +
                '}';
    }
}
