package com.example.landactivity;

public class LandOwner {
    String landownerName;
    String citizenship;
    String landLocation;
    String landArea;
    String landTax;

    public LandOwner(){

    }

    public LandOwner(String landownerName, String landLocation, String landArea,String citizenship,String landTax) {
        this.landownerName = landownerName;
        this.citizenship=citizenship;
        this.landLocation = landLocation;
        this.landArea = landArea;
        this.landTax = landTax;
    }

    public String getLandownerName() {
        return landownerName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getLandLocation() {
        return landLocation;
    }

    public String getLandArea() { return landArea; }

    public String getLandTax() { return landTax; }
}
