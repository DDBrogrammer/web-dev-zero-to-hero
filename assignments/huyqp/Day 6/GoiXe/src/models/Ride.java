package models;

public class Ride {
    // Kết nối hành khách, tài xế, và các địa điểm
    private int id;
    private Passenger passenger;
    private Driver driver;
    private Location from;
    private Location to;
    private String status;

    public Ride(int id, Passenger passenger, Location from, Location to) {
        this.id = id;
        this.passenger = passenger;
        this.from = from;
        this.to = to;
        this.status = "Chờ xác nhận";
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double calculateFare() {
        double distance = from.getDistance(to);
        return distance * 10; // Giá cước: 10.000 VNĐ/km
    }

    public void updateStatus(String status) {
        this.status = status;
        System.out.println("Trạng thái chuyến đi: " + status);
    }

    @Override
    public String toString() {
        return "Ride{id=" + id + ", passenger=" + passenger + ", driver=" + driver + ", status='" + status + "'}";
    }
}

