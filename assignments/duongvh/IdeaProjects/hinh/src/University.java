import java.util.*;

public class University {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public Department findDepartmentByName(String name) {
        for (Department department : departments) {
            if (department.getName().equalsIgnoreCase(name)) {
                return department;
            }
        }
        return null;
    }

    public void registerStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Teacher findTeacherById(String id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equalsIgnoreCase(id)) {
                return teacher;
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void assignCourseToTeacher(String teacherId, String courseId) {
        Teacher teacher = findTeacherById(teacherId);
        Course course = findCourseById(courseId);
        if (teacher != null && course != null) {
            teacher.addCourse(course);
            System.out.println("Đã gán khóa học " + course.getName() + " cho giảng viên " + teacher.getName());
        } else {
            System.out.println("Không tìm thấy giảng viên hoặc khóa học!");
        }
    }

    public void enrollStudentInCourse(String studentId, String courseId) {
        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);
        if (student != null && course != null) {
            student.addCourse(course);
            course.addStudent(student);
            System.out.println("Sinh viên " + student.getName() + " đã đăng ký khóa học " + course.getName());
        } else {
            System.out.println("Không tìm thấy sinh viên hoặc khóa học!");
        }
    }

    public void gradeStudent(String teacherId, String studentId, String courseId, double grade) {
        Teacher teacher = findTeacherById(teacherId);
        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);
        if (teacher != null && student != null && course != null) {
            if (teacher.getCourses().contains(course)) {
                student.addGrade(course, grade);
                System.out.println("Đã chấm điểm " + grade + " cho sinh viên " + student.getName() + " trong khóa học " + course.getName());
            } else {
                System.out.println("Giảng viên không giảng dạy khóa học này!");
            }
        } else {
            System.out.println("Không tìm thấy giảng viên, sinh viên hoặc khóa học!");
        }
    }

    private Course findCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equalsIgnoreCase(id)) {
                return course;
            }
        }
        return null;
    }

    public Department createDepartment(String cntt) {

        return null;
    }

    public void assignTeacherToDepartment(String t1, String computerScience) {
    }
}
