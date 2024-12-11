package main;

import models.*;
import services.DriverService;
import services.PassengerService;

public class Main {
    public static void main(String[] args) {
        PassengerService passengerService = new PassengerService();
        DriverService driverService = new DriverService();

        // Hành khách đăng ký
        passengerService.registerPassenger(1, "Huy", "0123456789");

        // Thêm tài xế
        Vehicle vehicle = new Vehicle("79A-12345", "Toyota Camry", 4);
        driverService.addDriver(new Driver(1, "Hinh", vehicle, new Location(10.0, 20.0)));

        // Đặt chuyến xe
        Passenger alice = new Passenger(1, "Huy", "0123456789");
        Location from = new Location(10.0, 20.0);
        Location to = new Location(15.0, 25.0);
        Ride ride = passengerService.requestRide(alice, from, to);

        // Tài xế nhận chuyến
        Driver nearestDriver = driverService.findNearestDriver(from);
        if (nearestDriver != null) {
            nearestDriver.acceptRide(ride);
            System.out.println("Giá cước: " + ride.calculateFare() + " VNĐ");
            nearestDriver.completeRide(ride);
        }
    }
}


