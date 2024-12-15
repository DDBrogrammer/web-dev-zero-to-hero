import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University("DA University");
        Department CNTT = new Department("CNTT");
        university.addDepartment(CNTT);

        Teacher teacher1 = new Teacher("T1", "DoDai", "CNTT");
        Teacher teacher2 = new Teacher("T2", "DaiDo", "CNTT");
        Teacher teacher3 = new Teacher("T3", "DaiD", "CNTT");
        university.addTeacher(teacher1);
        university.addTeacher(teacher2);
        university.addTeacher(teacher3);

        Student student1 = new Student("S1", "HinhDuong", "java");
        Student student2 = new Student("S2", "TuyenDo", "java");
        Student student3 = new Student("S3", "HuyPham", "java");
        Student student4 = new Student("S4", "Duonghi", "java");
        university.registerStudent(student1);
        university.registerStudent(student2);
        university.registerStudent(student3);
        university.registerStudent(student4);

        Course course1 = new Course("C1", "Lap Trinh JAVA Co Ban");
        Course course2 = new Course("C2", "Lap Trinh JAVA Nang Cao");
        university.addCourse(course1);
        university.addCourse(course2);

        university.assignCourseToTeacher("T1", "C1");
        university.assignCourseToTeacher("T2", "C2");

        university.assignTeacherToDepartment("T1", "CNTT");
        university.assignTeacherToDepartment("T2", "CNTT");

        university.enrollStudentInCourse("S1", "C1");
        university.enrollStudentInCourse("S2", "C1");
        university.enrollStudentInCourse("S3", "C1");
        university.enrollStudentInCourse("S1", "C2");
        university.enrollStudentInCourse("S2", "C2");
        university.enrollStudentInCourse("S3", "C2");

        university.gradeStudent("T1", "S1", "C1", 9.5);
        university.gradeStudent("T2", "S2", "C2", 8.0);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Quản lý đại học ===");
            System.out.println("1. Quản lý sinh viên");
            System.out.println("2. Quản lý giảng viên");
            System.out.println("3. Quản lý khóa học");
            System.out.println("4. Quản lý khoa");
            System.out.println("5.Tìm kiếm theo id");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> manageStudents(university, scanner);
                case 2 -> manageTeachers(university, scanner);
                case 3 -> manageCourses(university, scanner);
                case 4 -> manageDepartments(university, scanner);
                case 5 -> searchById(university, scanner);
                case 6 -> {
                    System.out.println("Chương trình kết thúc!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
        }
    }

    private static void manageStudents(University university, Scanner scanner) {
        System.out.println("\n=== Quản lý sinh viên ===");
        System.out.println("1. Đăng ký sinh viên");
        System.out.println("2. Đăng ký sinh viên vào khóa học");
        System.out.println("3. Xem danh sách khóa học và điểm");
        System.out.print("Chọn chức năng: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Nhập ID sinh viên: ");
                String id = scanner.nextLine();
                System.out.print("Nhập tên sinh viên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập chuyên ngành: ");
                String major = scanner.nextLine();
                Student student = new Student(id, name, major);
                university.registerStudent(student);
                System.out.println("Đã đăng ký sinh viên thành công!");
            }
            case 2 -> {
                System.out.print("Nhập ID sinh viên: ");
                String studentId = scanner.nextLine();
                System.out.print("Nhập ID khóa học: ");
                String courseId = scanner.nextLine();
                university.enrollStudentInCourse(studentId, courseId);
            }
            case 3 -> {
                System.out.print("Nhập ID sinh viên: ");
                String studentId = scanner.nextLine();
                Student student = university.findStudentById(studentId);
                if (student != null) {
                    student.displayGrades();
                } else {
                    System.out.println("Không tìm thấy sinh viên!");
                }
            }
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    private static void manageTeachers(University university, Scanner scanner) {
        System.out.println("\n=== Quản lý giảng viên ===");
        System.out.println("1. Thêm giảng viên");
        System.out.println("2. Gán khóa học cho giảng viên");
        System.out.println("3. Chấm điểm cho sinh viên");
        System.out.print("Chọn chức năng: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Nhập ID giảng viên: ");
                String id = scanner.nextLine();
                System.out.print("Nhập tên giảng viên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập khoa: ");
                String department = scanner.nextLine();
                Teacher teacher = new Teacher(id, name, department);
                university.addTeacher(teacher);
                System.out.println("Đã thêm giảng viên thành công!");
            }
            case 2 -> {
                System.out.print("Nhập ID giảng viên: ");
                String teacherId = scanner.nextLine();
                System.out.print("Nhập ID khóa học: ");
                String courseId = scanner.nextLine();
                university.assignCourseToTeacher(teacherId, courseId);
            }
            case 3 -> {
                System.out.print("Nhập ID giảng viên: ");
                String teacherId = scanner.nextLine();
                System.out.print("Nhập ID sinh viên: ");
                String studentId = scanner.nextLine();
                System.out.print("Nhập ID khóa học: ");
                String courseId = scanner.nextLine();
                System.out.print("Nhập điểm: ");
                double grade = scanner.nextDouble();
                scanner.nextLine();
                university.gradeStudent(teacherId, studentId, courseId, grade);
            }
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    private static void manageCourses(University university, Scanner scanner) {
        System.out.println("\n=== Quản lý khóa học ===");
        System.out.println("1. Thêm khóa học");
        System.out.println("2. Hiển thị danh sách khóa học");
        System.out.print("Chọn chức năng: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Nhập ID khóa học: ");
                String id = scanner.nextLine();
                System.out.print("Nhập tên khóa học: ");
                String name = scanner.nextLine();
                Course course = new Course(id, name);
                university.addCourse(course);
                System.out.println("Đã thêm khóa học thành công!");
            }
            case 2 -> university.displayCourses();
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    private static void manageDepartments(University university, Scanner scanner) {
        System.out.println("\n=== Quản lý khoa ===");
        System.out.println("1. Thêm khoa");
        System.out.println("2. Hiển thị danh sách giảng viên trong khoa");
        System.out.print("Chọn chức năng: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Nhập tên khoa: ");
                String name = scanner.nextLine();
                Department department = new Department(name);
                university.addDepartment(department);
                System.out.println("Đã thêm khoa thành công!");
            }
            case 2 -> {
                System.out.print("Nhập tên khoa: ");
                String name = scanner.nextLine();
                Department department = university.findDepartmentByName(name);
                if (department != null) {
                    department.displayTeachers();
                } else {
                    System.out.println("Không tìm thấy khoa!");
                }
            }
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }
    private static void searchById(University university, Scanner scanner) {
        System.out.println("\n=== Tìm kiếm thông tin theo ID ===");
        System.out.print("Nhập loại cần tìm kiếm (student, teacher, course): ");
        String type = scanner.nextLine().toLowerCase();

        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        switch (type) {
            case "student" -> {
                Student student = university.findStudentById(id);
                if (student != null) {
                    System.out.println("Thông tin sinh viên:");
                    System.out.println("ID: " + student.getId());
                    System.out.println("Tên: " + student.getName());
                    System.out.print("Khóa học: ");

                    // Hiển thị danh sách khóa học mà sinh viên đã đăng ký
                    for (Course course : university.getCourses()) {
                        if (course.hasStudent(student)) {
                            System.out.print(course.getName() + " ");
                        }
                    }

                    // Tìm khoa theo chuyên ngành của sinh viên
                    Department department = university.findDepartmentByName(student.getMajor());
                    System.out.println("\nKhoa: " + (department != null ? department.getName() : "Chưa được gán"));
                } else {
                    System.out.println("Không tìm thấy sinh viên có ID: " + id);
                }
            }

            case "teacher" -> {
                Teacher teacher = university.findTeacherById(id);
                if (teacher != null) {
                    System.out.println("Thông tin giảng viên:");
                    System.out.println("ID: " + teacher.getId());
                    System.out.println("Tên: " + teacher.getName());
                    System.out.println("Khoa: " + teacher.getDepartment());
                } else {
                    System.out.println("Không tìm thấy giảng viên có ID: " + id);
                }
            }

            case "course" -> {
                Course course = university.findCourseById(id);
                if (course != null) {
                    System.out.println("Thông tin khóa học:");
                    System.out.println("ID: " + course.getId());
                    System.out.println("Tên khóa học: " + course.getName());
                    System.out.print("Danh sách sinh viên: ");

                    for (Student student : course.getEnrolledStudents()) {
                        System.out.print(student.getName() + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Không tìm thấy khóa học có ID: " + id);
                }
            }

            default -> System.out.println("Loại tìm kiếm không hợp lệ! Hãy nhập 'student', 'teacher' hoặc 'course'.");
        }
    }

}