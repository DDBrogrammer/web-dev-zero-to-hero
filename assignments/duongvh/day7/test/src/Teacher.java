public class Teacher {
    private static final int MAX_COURSES = 100;
    private String id;
    private String name;
    private String department;
    private Course[] courses;
    private int courseCount;

    public Teacher(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courses = new Course[MAX_COURSES];
        this.courseCount = 0;
    }

    public Teacher(String name, String department) {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (courseCount < MAX_COURSES) {
            courses[courseCount++] = course;
        } else {
            System.out.println("Giáo viên đã đạt số lượng khóa học tối đa.");
        }
    }

    public Course[] getCourses() {
        Course[] currentCourses = new Course[courseCount];
        System.arraycopy(courses, 0, currentCourses, 0, courseCount);
        return currentCourses;
    }

    public boolean teachesCourse(Course course) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(course)) {
                return true;
            }
        }
        return false;
    }

    public String getDepartment() {
        return department;
    }

}
