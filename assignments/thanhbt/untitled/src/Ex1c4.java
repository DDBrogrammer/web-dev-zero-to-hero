public class Ex1c4 {
    public static void main(String[] args) {
        int day = 3;
        String result = "";
        switch (day) {
            case 1:
            case 2:
                result += "Weekday";
            case 3:
                result += "Midweek";
            case 4:
            case 5:
                result += "Weekend";
                break;
            default:
                result += "Unknown";
        }
        // Do break ở sau case 5 do đó khi đạt giá trị 3 nó tiếp tục chạy đến hết case 5
        System.out.println(result);
        //Result: MidweekWeekend
    }
}
