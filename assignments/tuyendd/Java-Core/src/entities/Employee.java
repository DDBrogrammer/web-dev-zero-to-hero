package entities;

public class Employee {
    private String name ;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private int id ;
    private static int baseid =0 ;

    public Employee(String address, int age, String gender, String name, String phone) {
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.id = baseid;
        this.name = name;
        this.phone = phone;
        baseid++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBaseid() {
        return baseid;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", id=" + id +
                '}';
    }
}
