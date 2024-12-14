public class Course {
    private String id;
    private String name;
    private Student[] students;
    private int studentCount;
    private static final int MAX_STUDENTS = 100;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Khóa học đã đạt số lượng sinh viên tối đa!");
        }
    }

    public Student[] getStudents() {
        Student[] currentStudents = new Student[studentCount];
        System.arraycopy(students, 0, currentStudents, 0, studentCount);
        return currentStudents;
    }

    @Override
    public String toString() {
        return "Khóa học: " + name + " (ID: " + id + ")";
    }

    public boolean hasStudent(Student student) {

        return false;
    }

    public Student[] getEnrolledStudents() {
        Student[] students = new Student[studentCount];
        System.arraycopy(students, 0, students, 0, studentCount);
        return students;
    }
    public void getDepartment() {
        return ;
    }
}
