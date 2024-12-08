public class Customer {
    private int id;
    private String name;
    private String phoneNumber;
    Product[] shoppingCart;
    int[] quantities;
    private int cartSize;
    private static String[] testStrings;

    public Customer(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.shoppingCart = new Product[100]; // Giới hạn tối đa 100 sản phẩm trong giỏ hàng
        this.quantities = new int[100];
        this.cartSize = 0;
    }

    public void addToCart(Product product, int quantity) {
        if (product.getStockQuantity() >= quantity) {
            shoppingCart[cartSize] = product;
            quantities[cartSize] = quantity;
            cartSize++;
            product.updateStock(-quantity);
        } else {
            System.out.println("Insufficient stock for product: " + product.getInfo());
        }
    }

    public void viewCart() {
        System.out.println("Shopping Cart of " + name + ":");
        for (int i = 0; i < cartSize; i++) {
            System.out.println(shoppingCart[i].getInfo() + ", Quantity: " + quantities[i]);
        }
    }

    public int getId() {
        return id;
    }

    public static void ValidatePhone ( int phoneNumber) {
        String pattern = "^/d(?:-/d{3}){3}/d$";
        for (String inputString : testStrings) {
            System.out.print(inputString + ": ");
            if (inputString.matches(pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            return;
        }
    }}


