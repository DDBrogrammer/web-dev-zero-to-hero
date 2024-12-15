package entities;

import entities.Driver;
import entities.Vehicle;

public class Motorbike extends Vehicle {
    public Motorbike(String licensePlate, String model, String color, Driver owner) {
        super(licensePlate, model, color, owner);
    }

    @Override
    public void displayInfo() {
        System.out.println("Loại phương tiện: Motorbike");
        System.out.println("Tên tài xế sở hữu: " + getOwner().getName());
        System.out.println("Tên xe: " + getModel());
        System.out.println("Biển số xe: " + getLicensePlate());
        System.out.println("Màu xe: " + getColor());
    }
}
