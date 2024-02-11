package Main.staff;

import Main.university.Staff;
import Main.util.Administrative;

public class AdminStaff extends Staff implements Administrative {
    private String role;

    public AdminStaff(String name, String staffId, String role) {
        super(name, staffId);
        this.role = role;
    }

    public AdminStaff() {
        super();
        this.role = "";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void display() {
        System.out.println("Admin Staff: " + name + ", ID: " + staffId + ", Role: " + role);
    }

    @Override
    public void manage() {
        System.out.println("Admin staff " + getName() + " is managing.");
    }
}