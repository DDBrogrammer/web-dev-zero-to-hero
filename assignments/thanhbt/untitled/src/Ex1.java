public class Ex1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x++ < 5) {
            y += x; // y= y + x
        } else if (x < 10) {
            y -= x; // y= y - x
        } else {
            y *= x; // y = y * x
        }
        System.out.println(y);
        // Result: 4
    }
}




