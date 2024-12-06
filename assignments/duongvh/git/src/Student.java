import java.util.*;

public class Student {
    private String id;
    private String name;
    private String major;
    private List<Course> courses;
    private Map<Course, Double> grades;

    public Student(String id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addGrade(Course course, double grade) {
        grades.put(course, grade);
    }

    public void displayGrades() {
        System.out.println("Danh sách khóa học và điểm của sinh viên " + name + ":");
        for (Course course : courses) {
            double grade = grades.getOrDefault(course, -1.0);
            System.out.println(course.getName() + ": " + (grade >= 0 ? grade : "Chưa có điểm"));
        }
    }
}
