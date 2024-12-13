public class Ex1c9 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 100) {
            if (x > 10) break;
            x *=2;
        }
        System.out.println(x);
        //Result: 16
    }
}
