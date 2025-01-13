import entities.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket();

        while (true) {
            System.out.println("\nSupermarket Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Register Customer");
            System.out.println("3. Hire Employee");
            System.out.println("4. Add Product to Cart");
            System.out.println("5. View Customer Cart");
            System.out.println("6. Process Payment");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter stock quantity: ");
                    int stock = scanner.nextInt();
                    supermarket.addProduct(new Product(productId, productName, price, stock));
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.print("Enter customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    supermarket.registerCustomer(new Customer(customerId, customerName, phoneNumber));
                    System.out.println("Customer registered successfully.");
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    String employeeId = scanner.nextLine();
                    System.out.print("Enter employee name: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Enter employee role: ");
                    String role = scanner.nextLine();
                    supermarket.hireEmployee(new Employee(employeeId, employeeName, role));
                    System.out.println("Employee hired successfully.");
                    break;

                case 4:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    Customer customer = supermarket.findCustomerById(customerId);
                    if (customer == null) {
                        System.out.println("Customer not found.");
                        break;
                    }

                    System.out.print("Enter product ID: ");
                    productId = scanner.nextLine();
                    Product product = supermarket.findProductById(productId);
                    if (product == null) {
                        System.out.println("Product not found.");
                        break;
                    }

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    customer.addToCart(product, quantity);
                    break;

                case 5:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    customer = supermarket.findCustomerById(customerId);
                    if (customer == null) {
                        System.out.println("Customer not found.");
                        break;
                    }
                    customer.viewCart();
                    break;

                case 6:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    customer = supermarket.findCustomerById(customerId);
                    if (customer == null) {
                        System.out.println("Customer not found.");
                        break;
                    }

                    System.out.print("Enter invoice ID: ");
                    String invoiceId = scanner.nextLine();
                    Invoice invoice = new Invoice(invoiceId, customer);

                    System.out.print("Enter employee ID: ");
                    employeeId = scanner.nextLine();
                    Employee employee = supermarket.findEmployeeById(employeeId);
                    if (employee == null) {
                        System.out.println("Employee not found.");
                        break;
                    }

                    employee.processPayment(customer, invoice);
                    invoice.printInvoice();
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}