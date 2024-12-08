package models;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getDistance(Location other) {
        double dx = this.latitude - other.latitude;
        double dy = this.longitude - other.longitude;
        return Math.sqrt(dx * dx + dy * dy); // Tính khoảng cách Euclid
    }

    @Override
    public String toString() {
        return "Location{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
    }
}
