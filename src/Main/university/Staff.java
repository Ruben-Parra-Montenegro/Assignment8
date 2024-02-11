package Main.university;

public abstract class Staff extends Person {
    protected String staffId;

    public Staff(String name, String staffId) {
        super(name);
        this.staffId = staffId;
    }

    public Staff() {
        super();
        this.staffId = "";
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public void display() {
        System.out.println("Staff: " + name + ", ID: " + staffId);
    }
}