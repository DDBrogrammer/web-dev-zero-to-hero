package models;

public class Passenger {
    // Đại diện cho hành khách, lưu thông tin và yêu cầu chuyến đi
    private int id;
    private String name;
    private String phoneNumber;

    public Passenger(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void requestRide(Location from, Location to) {
        System.out.println(name + " đã yêu cầu chuyến xe từ " + from + " đến " + to);
    }

    @Override
    public String toString() {
        return "Passenger{id=" + id + ", name='" + name + "', phoneNumber='" + phoneNumber + "'}";
    }
}
