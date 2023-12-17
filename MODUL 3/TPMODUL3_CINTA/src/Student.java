public class Student extends User {
    protected ArrayList<String> enrolledCourse;

    public Student(String name, int id) {
        super(name, id);
        this.enrolledCourse = new ArrayList<>();
    }
    public void enrollInCourse(String course) {
        enrolledCourse.add(course);
    }
    public String getUserDetails(){
        return super.getUserDetails() + "\n Enrolled Course: " + enrolledCourse;
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;