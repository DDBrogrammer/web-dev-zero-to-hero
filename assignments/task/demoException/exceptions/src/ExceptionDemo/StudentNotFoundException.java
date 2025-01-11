package ExceptionDemo;

public class StudentNotFoundException extends Exception {
    StudentNotFoundException() {
        super("Học sinh không tồn tại !");
    }
}
