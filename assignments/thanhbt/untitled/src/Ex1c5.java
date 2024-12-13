public class Ex1c5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                count += i + j;
            }
        }
        System.out.println(count);
        // Result: 18
    }
}
