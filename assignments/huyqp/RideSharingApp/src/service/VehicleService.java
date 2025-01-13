package service;

import Constants.Constant;
import entities.Car;
import entities.Driver;
import entities.Motorbike;
import entities.Vehicle;

public class VehicleService {
    public void addVehicle(Driver driver, String type, String licensePlate, String model, String color) {
        if(driver==null){
            System.out.println("ko co tai xe");
            return;
        }
        Vehicle vehicle = null;

        if (Constant.CarType.MOTOBIKE.equalsIgnoreCase(type)) {
            vehicle = new Motorbike(licensePlate, model, color, driver);
        } else if (Constant.CarType.CAR.equalsIgnoreCase(type)) {
            vehicle = new Car(licensePlate, model, color, driver);
        } else {
            System.out.println("Loại phương tiện không hợp lệ!");
            return;
        }

        driver.addVehicle(vehicle);
        System.out.println("Phương tiện đã được thêm thành công!");
    }
}

