public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 123);
        student.enrollInCourse("Math");
        student.enrollInCourse("Physics");

        Teacher teacher = new Teacher("Jane Smith", 456);
        teacher.teachClass("Computer Science");

        Admin admin = new Admin("Admin User", 789);
        admin.manageSystem("Add New User");

        displayUserDetails(student);
        displayUserDetails(teacher);
        displayUserDetails(admin);
    }

    public static void displayUserDetails(User user) {
        System.out.println("\nUser Details:\n" + user.getUserDetails());
    }
}