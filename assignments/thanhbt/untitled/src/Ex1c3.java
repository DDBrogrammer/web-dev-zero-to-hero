public class Ex1c3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 5) {
            i++; // i tăng lên 1 cấp
            j += i; // j = j + i
        }
        System.out.println(j);
        // Result: 15
    }
}
