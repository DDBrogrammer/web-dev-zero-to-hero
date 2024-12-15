package entities;

import javax.lang.model.element.Name;

public class Passenger {
    private int id;
    private String username;
    private String password;
    private String name;
    private String phonenumber;

    public Passenger(int Id, String Username, String Password) {
        this.id = Id;
        this.username = Username;
        this.password = Password;
    }

    public Passenger() {
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phonenumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    // Đặt chuyến xe
    public Ride requestRide(int rideId, Location from, Location to) {
        System.out.println(name + " đã yêu cầu chuyến xe từ " + from + " đến " + to);
        return new Ride(rideId, this, from, to);
    }
}




