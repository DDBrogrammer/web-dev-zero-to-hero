package models;

public class Driver {
    private int id;
    private String name;
    private Vehicle vehicle;
    private Location currentLocation;

    public Driver(int id, String name, Vehicle vehicle, Location currentLocation) {
        this.id = id;
        this.name = name;
        this.vehicle = vehicle;
        this.currentLocation = currentLocation;
    }

    public void acceptRide(Ride ride) {
        ride.setDriver(this);
        ride.updateStatus("Đã nhận chuyến");
        System.out.println(name + " đã nhận chuyến.");
    }

    public void completeRide(Ride ride) {
        ride.updateStatus("Đã hoàn thành");
        System.out.println(name + " đã hoàn tất chuyến đi.");
    }

    @Override
    public String toString() {
        return "Driver{id=" + id + ", name='" + name + "', vehicle=" + vehicle + "}";
    }
}
