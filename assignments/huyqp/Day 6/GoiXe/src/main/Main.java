package main;

import models.*;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo
        Passenger passenger = new Passenger(1, "Huy", "0123456789");
        Vehicle vehicle = new Vehicle("79A-12345", "Toyota Camry", 4);
        Driver driver = new Driver(1, "Hinh", vehicle, new Location(10.0, 20.0));
        Location from = new Location(10.0, 20.0);
        Location to = new Location(15.0, 25.0);

        // Passenger yêu cầu chuyến xe
        passenger.requestRide(from, to);
        Ride ride = new Ride(1, passenger, from, to);

        // Driver nhận chuyến
        driver.acceptRide(ride);

        // Tính giá cước
        double fare = ride.calculateFare();
        System.out.println("Giá cước: " + fare + " VNĐ");

        // Driver hoàn tất chuyến
        driver.completeRide(ride);
    }
}

