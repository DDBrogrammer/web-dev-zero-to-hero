package entities;

public class Reader {
    private int id;
    private static int baseId;
    private String name;
    private int age;
    private String gender;
    private String mail;
    private String phone;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getBaseId() {
        return baseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Reader(String name, int age, String gender, String mail, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.id = baseId;
        baseId++;
    }

    public Reader() {
        this.id = baseId;
        baseId++;
    }
}
