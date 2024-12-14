public class Department {
    private String name;
    private Teacher[] teachers;
    private int teacherCount;
    private static final int MAX_TEACHERS = 100;

    public Department(String name) {
        this.name = name;
        this.teachers = new Teacher[MAX_TEACHERS];
        this.teacherCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addTeacher(Teacher teacher) {
        if (teacherCount < MAX_TEACHERS) {
            teachers[teacherCount++] = teacher;
        } else {
            System.out.println("Không thể thêm giảng viên, danh sách đã đầy!");
        }
    }

    public void displayTeachers() {
        System.out.println("Danh sách giảng viên trong khoa " + name + ":");
        if (teacherCount == 0) {
            System.out.println("Không có giảng viên nào trong khoa.");
            return;
        }
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i].getName());
        }
    }

    public Teacher[] getTeachers() {
        Teacher[] currentTeachers = new Teacher[teacherCount];
        System.arraycopy(teachers, 0, currentTeachers, 0, teacherCount);
        return currentTeachers;
    }
}
