public class Student {
    private String id;
    private String name;
    private String major;
    private Course[] courses;
    private double[] grades;
    private int courseCount;

    private static final int MAX_COURSES = 100;

    public Student(String id, String name, String major) {
        this.id = id;
        this.major = major;
        this.courses = new Course[MAX_COURSES];
        this.grades = new double[MAX_COURSES];
        this.courseCount = 0;

        for (int i = 0; i < MAX_COURSES; i++) {
            grades[i] = 0;
        }
    }

    public Student(String name, String major) {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (courseCount < MAX_COURSES) {
            courses[courseCount] = course;
            courseCount++;
        } else {
            System.out.println("Không thể thêm khóa học. Số lượng khóa học đã đạt tối đa.");
        }
    }

    public void addGrade(Course course, double grade) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i] != null && courses[i].equals(course)) {
                grades[i] = grade;
                return;
            }
        }
        System.out.println("Không tìm thấy khóa học trong danh sách của sinh viên.");
    }

    public void displayGrades() {
        System.out.println("Danh sách khóa học và điểm của sinh viên " + name + ":");
        for (int i = 0; i < courseCount; i++) {
            String gradeStr = grades[i] >= 0 ? String.valueOf(grades[i]) : "Chưa có điểm";
            System.out.println(courses[i].getName() + ": " + gradeStr);
        }
    }

    public String getMajor() {

        return "";
    }

}
