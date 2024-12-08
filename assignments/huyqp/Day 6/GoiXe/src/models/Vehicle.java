package models;

public class Vehicle {
    private String licensePlate;
    private String model;
    private int capacity;

    public Vehicle(String licensePlate, String model, int capacity) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.capacity = capacity;
    }

    public String getInfo() {
        return "Vehicle{licensePlate='" + licensePlate + "', model='" + model + "', capacity=" + capacity + "}";
    }

    @Override
    public String toString() {
        return getInfo();
    }
}

