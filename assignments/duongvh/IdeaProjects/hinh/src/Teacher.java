import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String id;
    private String name;
    private String department;
    private List<Course> courses;

    public Teacher(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
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

    public List<Course> getCourses() {
        return courses;
    }
}
