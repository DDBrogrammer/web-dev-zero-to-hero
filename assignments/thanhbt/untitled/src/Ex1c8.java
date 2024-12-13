public class Ex1c8 {
    public static void main(String[] args) {
        int result = 10;
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                result -= 3;
                continue;
            }
            if (i==8)
                break;
            //Result: 1
        }
        System.out.println(result);

    }
}
