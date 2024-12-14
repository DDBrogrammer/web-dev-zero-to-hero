package entities;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private int id;
    private String name;
    private String username;
    private String password;
    private String phonenumber;
    private Location currentLocation; // Vị trí hiện tại
    private List<Vehicle> vehicles; // Danh sách phương tiện

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public Driver(int id, String name, Location currentLocation) {
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public Location getCurrentLocation() {
        return currentLocation;
    }
    public int getId() {
        return id;
    }
    public void setId(int Id) {
        this.id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = Name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String PhoneNumber) {
        this.phonenumber = PhoneNumber;
    }

    // Thêm phương tiện vào danh sách
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    // Hiển thị tất cả phương tiện
    public void displayVehicles() {
        System.out.println("Phương tiện của tài xế " + name + ":");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("--------------------------");
        }
    }
}
