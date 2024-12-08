import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== SUPERMARKET MANAGEMENT ===");
            System.out.println("1. Add Product");
            System.out.println("2. Register Customer");
            System.out.println("3. Add Product to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Hire Employee");
            System.out.println("6. Process Payment");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();

                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();

                    System.out.print("Enter product stock quantity: ");
                    int stockQuantity = scanner.nextInt();

                    Product product = new Product(productId, productName, productPrice, stockQuantity);
                    supermarket.addProduct(product);
                    System.out.println("Product added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter customer phone number: ");

                    String phoneNumber = scanner.nextLine();

                    Customer customer = new Customer(customerId, customerName, phoneNumber);
                    supermarket.registerCustomer(customer);
                    System.out.println("Customer registered successfully!");
                }
                case 3 -> {
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    Customer customer = supermarket.findCustomerById(customerId);

                    if (customer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }

                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    Product product = supermarket.findProductById(productId);

                    if (product == null) {
                        System.out.println("Product not found!");
                        break;
                    }

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    customer.addToCart(product, quantity);
                    System.out.println("Product added to cart!");
                }
                case 4 -> {
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    Customer customer = supermarket.findCustomerById(customerId);

                    if (customer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }

                    customer.viewCart();
                }
                case 5 -> {
                    System.out.print("Enter employee ID: ");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter employee name: ");
                    String employeeName = scanner.nextLine();

                    System.out.print("Enter employee role: ");
                    String role = scanner.nextLine();

                    Employee employee = new Employee(employeeId, employeeName, role);
                    supermarket.hireEmployee(employee);
                    System.out.println("Employee hired successfully!");
                }
                case 6 -> {
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    Customer customer = supermarket.findCustomerById(customerId);

                    if (customer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }

                    System.out.print("Enter employee ID: ");
                    int employeeId = scanner.nextInt();
                    Employee employee = supermarket.findEmployeeById(employeeId);

                    if (employee == null) {
                        System.out.println("Employee not found!");
                        break;
                    }

                    Invoice invoice = new Invoice(customerId, customer);
                    employee.processPayment(customer, invoice);
                }
                case 7 -> {
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}