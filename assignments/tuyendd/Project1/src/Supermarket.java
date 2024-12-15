public class Supermarket {
    private Product[] productList;
    private Customer[] customerList;
    private Employee[] employeeList;
    private int productCount;
    private int customerCount;
    private int employeeCount;

    public Supermarket() {
        this.productList = new Product[100]; // Giới hạn tối đa 100 sản phẩm
        this.customerList = new Customer[100];
        this.employeeList = new Employee[100];
        this.productCount = 0;
        this.customerCount = 0;
        this.employeeCount = 0;
    }

    public void addProduct(Product product) {
        productList[productCount++] = product;
    }

    public void hireEmployee(Employee employee) {
        employeeList[employeeCount++] = employee;
    }

    public void registerCustomer(Customer customer) {
        customerList[customerCount++] = customer;
    }

    public Product findProductById(int id) {
        for (int i = 0; i < productCount; i++) {
            if (productList[i].getId() == id) {
                return productList[i];
            }
        }
        return null;
    }

    public Customer findCustomerById(int id) {
        for (int i = 0; i < customerCount; i++) {
            if (customerList[i].getId() == id) {
                return customerList[i];
            }
        }
        return null;
    }

    public Employee findEmployeeById(int id) {
        for (int i = 0; i < employeeCount; i++) {
            if (employeeList[i].getId() == id) {
                return employeeList[i];
            }
        }
        return null;
    }
}
