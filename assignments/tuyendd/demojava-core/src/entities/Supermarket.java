package entities;
import java.util.ArrayList;
import java.util.List;
public class Supermarket {
    private List<Product> productList;
    private List<Customer> customerList;
    private List<Employee> employeeList;

    public Supermarket() {
        this.productList = new ArrayList<>();
        this.customerList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void hireEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void registerCustomer(Customer customer) {
        customerList.add(customer);
    }

    public Product findProductById(String id) {
        for (Product product : productList) {
            if (product.getName().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Customer findCustomerById(String customerId) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public Employee findEmployeeById(String employeeId) {
        for (Employee employee : employeeList) {
            if (employee.getName().equals(employeeId)) {
                return employee;
            }

        }
        return null;
    }

}
