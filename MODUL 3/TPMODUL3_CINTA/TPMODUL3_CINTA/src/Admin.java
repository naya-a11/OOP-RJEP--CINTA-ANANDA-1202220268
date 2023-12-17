class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String action) {
        System.out.println("Managing system: " + action);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + "\nRole: Admin";
    }
}