public class Ex9 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "apple":
                System.out.println("APPLE");
            case "mango":
                System.out.println("MANGO");
                case "banana":
                    System.out.println("BANANA");
                    break;
            default:
                System.out.println("any fruit will do");
        }
    }//Result: MANGO BANANA
}
