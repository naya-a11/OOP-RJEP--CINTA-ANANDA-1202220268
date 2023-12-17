class Student extends User {
    protected ArrayList<String> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public String getUserDetails() {
        return super.getUserDetails() + "\nEnrolled Courses: " + getEnrolledCourses().toString();
    }
}