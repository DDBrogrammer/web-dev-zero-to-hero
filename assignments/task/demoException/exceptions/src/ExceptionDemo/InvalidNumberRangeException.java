package ExceptionDemo;

public class InvalidNumberRangeException extends Exception {
    InvalidNumberRangeException(int start, int end) {
        super("số nhập vào phải trong khoảng [" + start + ", " + end + "]");
    }
}
