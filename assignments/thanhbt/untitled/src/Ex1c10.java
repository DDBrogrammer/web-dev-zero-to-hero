public class Ex1c10 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1, j = 0; i <=5; i++) {
            j += i;
            if (j > 6) {
                System.out.println(j);
                break;
    //Result: 10
            }
        }
    }
}
