
public class University {
    private String name;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;
    private Department[] departments;
    private int studentCount;
    private int teacherCount;
    private int courseCount;
    private int departmentCount;

    public static final int MAX_STUDENTS = 100;
    public static final int MAX_TEACHERS = 50;
    public static final int MAX_COURSES = 50;
    public static final int MAX_DEPARTMENTS = 20;

    public University(String name) {
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.teachers = new Teacher[MAX_TEACHERS];
        this.courses = new Course[MAX_COURSES];
        this.departments = new Department[MAX_DEPARTMENTS];
        this.studentCount = 0;
        this.teacherCount = 0;
        this.courseCount = 0;
        this.departmentCount = 0;
    }

    // Thêm khoa
    public void addDepartment(Department department) {
        if (departmentCount < MAX_DEPARTMENTS) {
            departments[departmentCount++] = department;
        } else {
            System.out.println("Không thể thêm khoa, danh sách khoa đã đầy!");
        }
    }

    // Tìm khoa theo tên
    public Department findDepartmentByName(String name) {
        for (int i = 0; i < departmentCount; i++) {
            if (departments[i].getName().equalsIgnoreCase(name)) {
                return departments[i];
            }
        }
        return null;
    }

    // Thêm sinh viên
    public void registerStudent(Student student) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount++] = student;
        } else {
            System.out.println("Không thể thêm sinh viên, danh sách sinh viên đã đầy!");
        }
    }

    // Tìm sinh viên theo ID
    public Student findStudentById(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return students[i];
            }
        }
        return null;
    }

    // Thêm giảng viên
    public void addTeacher(Teacher teacher) {
        if (teacherCount < MAX_TEACHERS) {
            teachers[teacherCount++] = teacher;
        } else {
            System.out.println("Không thể thêm giảng viên, danh sách giảng viên đã đầy!");
        }
    }

    // Tìm giảng viên theo ID
    public Teacher findTeacherById(String id) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].getId().equalsIgnoreCase(id)) {
                return teachers[i];
            }
        }
        return null;
    }

    // Thêm khóa học
    public void addCourse(Course course) {
        if (courseCount < MAX_COURSES) {
            courses[courseCount++] = course;
        } else {
            System.out.println("Không thể thêm khóa học, danh sách khóa học đã đầy!");
        }
    }

    // Hiển thị danh sách khóa học
    public void displayCourses() {
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }

    // Tìm khóa học theo ID
    Course findCourseById(String id) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getId().equalsIgnoreCase(id)) {
                return courses[i];
            }
        }
        return null;
    }

    // Gán khóa học cho giảng viên
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

    // Đăng ký sinh viên vào khóa học
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

    // Chấm điểm sinh viên
    public void gradeStudent(String teacherId, String studentId, String courseId, double grade) {
        Teacher teacher = findTeacherById(teacherId);
        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);
        if (teacher != null && student != null && course != null) {
            if (teacher.teachesCourse(course)) {
                student.addGrade(course, grade);
                System.out.println("Đã chấm điểm " + grade + " cho sinh viên " + student.getName() + " trong khóa học " + course.getName());
            } else {
                System.out.println("Giảng viên không giảng dạy khóa học này!");
            }
        } else {
            System.out.println("Không tìm thấy giảng viên, sinh viên hoặc khóa học!");
        }
    }

    // Gán giảng viên vào khoa
    public void assignTeacherToDepartment(String teacherId, String departmentName) {
        Teacher teacher = findTeacherById(teacherId);
        Department department = findDepartmentByName(departmentName);

        if (teacher != null && department != null) {
            department.addTeacher(teacher);
            System.out.println("Đã gán giảng viên " + teacher.getName() + " vào khoa " + department.getName());
        } else {
            System.out.println("Không tìm thấy giảng viên hoặc khoa!");
        }
    }

    // Tìm kiếm tổng quát thông tin
    public Object findEntityById(String id, String type) {
        switch (type.toLowerCase()) {
            case "student":
                return findStudentById(id);
            case "teacher":
                return findTeacherById(id);
            case "course":
                return findCourseById(id);
            default:
                System.out.println("Loại đối tượng không hợp lệ.");
                return null;
        }
    }

    public void displayEntityInfo(String id, String type) {
        Object entity = findEntityById(id, type);
        if (entity == null) {
            System.out.println("Không tìm thấy " + type + " với ID: " + id);
            return;
        }
        if (entity instanceof Student) {
            Student student = (Student) entity;
            System.out.println("Thông tin sinh viên: " + student);
        } else if (entity instanceof Teacher) {
            Teacher teacher = (Teacher) entity;
            System.out.println("Thông tin giảng viên: " + teacher);
        } else if (entity instanceof Course) {
            Course course = (Course) entity;
            System.out.println("Thông tin khóa học: " + course);
        }
    }

    public Course[] getCourses() {

        return new Course[0];
    }
}
