package services;

import models.Passenger;
import models.Location;
import models.Ride;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {
    // Quản lý hành khách
    private List<Passenger> passengers = new ArrayList<>();

    public void registerPassenger(int id, String name, String phoneNumber) {
        Passenger passenger = new Passenger(id, name, phoneNumber);
        passengers.add(passenger);
        System.out.println("Hành khách đăng ký: " + passenger);
    }

    public Ride requestRide(Passenger passenger, Location from, Location to) {
        Ride ride = new Ride(passengers.size() + 1, passenger, from, to);
        System.out.println("Chuyến xe được tạo: " + ride);
        return ride;
    }
}

