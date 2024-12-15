public class Ex1c2 {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        int result = (a > b) ? (b > c ? c : b) : (a < c ? a : c);
        // Nếu điều kiện nếu (a > b) đúng thì xét đến (b > c ? c : b), sai thì xét (a < c ? a : c)
        System.out.println(result);
        // Result: 3
    }
}

