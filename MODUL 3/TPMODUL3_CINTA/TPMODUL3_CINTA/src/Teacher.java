class Teacher extends User {
    public Teacher(String name, int id) {
        super(name, id);
    }

    public void teachClass(String course) {
        System.out.println("Teaching " + course);
    }

    public String getUserDetails() {
        return super.getUserDetails() + "\nRole: Teacher";
    }
}