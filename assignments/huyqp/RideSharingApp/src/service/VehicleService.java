package service;

import entities.Car;
import entities.Driver;
import entities.Motorbike;
import entities.Vehicle;

public class VehicleService {
    public void addVehicle(Driver driver, String type, String licensePlate, String model, String color) {
        Vehicle vehicle = null;

        if ("Motorbike".equalsIgnoreCase(type)) {
            vehicle = new Motorbike(licensePlate, model, color, driver);
        } else if ("Car".equalsIgnoreCase(type)) {
            vehicle = new Car(licensePlate, model, color, driver);
        } else {
            System.out.println("Loại phương tiện không hợp lệ!");
            return;
        }

        driver.addVehicle(vehicle);
        System.out.println("Phương tiện đã được thêm thành công!");
    }
}

