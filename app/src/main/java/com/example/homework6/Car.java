package com.example.homework6;

public class Car {
    private String name;
    private double price;
    private String type;
    private String description;
    private String ruleType;
    private String city;
    private String passTime;
    private int viewCount;
    private int imageId;

    public Car(int imageId, String name, double price, String type, String description, String ruleType, String city, String passTime, int viewCount){
        this.imageId = imageId;
        this.name = name;
        this.price = price;
        this.passTime = passTime;
        this.type = type;
        this.description = description;
        this.ruleType = ruleType;
        this.city = city;
        this.viewCount = viewCount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassTime() {
        return passTime;
    }

    public void setPassTime(String passTime) {
        this.passTime = passTime;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
