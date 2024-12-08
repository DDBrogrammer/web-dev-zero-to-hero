public class Employee {
    private String name;
    private int age;
    private String role ;

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public static int processPayment(Customer customer, Invoice invoice){
        return 0;
    }
}
