package entities;

public abstract class Vehicle {
    private String licensePlate; // Biển số xe
    private String model;        // Tên xe
    private String color;        // Màu xe
    private Driver owner;        // Tài xế sở hữu

    public Vehicle(String licensePlate, String model, String color, Driver owner) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.color = color;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Driver getOwner() {
        return owner;
    }

    public void setOwner(Driver owner) {
        this.owner = owner;
    }

    public abstract void displayInfo();
}

