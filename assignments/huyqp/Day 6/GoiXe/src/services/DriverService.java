package services;

import models.Driver;
import models.Location;

import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Tài xế được thêm: " + driver);
    }

    public Driver findNearestDriver(Location location) {
        Driver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;
        for (Driver driver : drivers) {
            double distance = driver.getCurrentLocation().getDistance(location);
            if (distance < minDistance) {
                minDistance = distance;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }
}


