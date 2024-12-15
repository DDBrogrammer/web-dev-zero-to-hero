import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Teacher> teachers;

    public Department(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void displayTeachers() {
        System.out.println("Danh sách giảng viên trong khoa " + name + ":");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }
    }
}
