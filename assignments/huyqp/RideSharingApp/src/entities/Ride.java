package entities;

import entities.Driver;
import entities.Location;
import entities.Passenger;

public class Ride {
    private int id;                  // ID chuyến đi
    private Passenger passenger;     // Hành khách đặt chuyến
    private Driver driver;           // Tài xế thực hiện chuyến đi
    private Location from;           // Điểm xuất phát
    private Location to;             // Điểm đến
    private String status;           // Trạng thái chuyến đi ("Requested", "Accepted", "Completed")


    public Ride(int id, Passenger passenger, Location from, Location to) {
        this.id = id;
        this.passenger = passenger;
        this.from = from;
        this.to = to;
        this.status = "Requested"; // Mặc định là đã được yêu cầu
    }

    // Tính giá cước dựa trên khoảng cách
    public double calculateFare() {
        double distance = from.getDistance(to);
        return distance * 5000.0; // Giá mỗi đơn vị khoảng cách là 5000
    }

    // Cập nhật trạng thái
    public void updateStatus(String status) {
        this.status = status;
    }

    // Getter và hiển thị thông tin chuyến đi
    public void displayRideDetails() {
        System.out.println("ID Chuyến đi: " + id);
        System.out.println("Hành khách: " + passenger.getName());
        System.out.println("Điểm đi: " + from);
        System.out.println("Điểm đến: " + to);
        System.out.println("Tài xế: " + (driver != null ? driver.getName() : "Chưa được gán"));
        System.out.println("Trạng thái: " + status);
        System.out.println("Giá cước dự kiến: " + calculateFare() + " VND");
    }

    // Setter cho tài xế
    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Accepted";
    }

    public int getId() {
        return id;
    }
}
