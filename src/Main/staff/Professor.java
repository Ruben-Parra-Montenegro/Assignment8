package Main.staff;

import Main.university.Department;
import Main.university.Staff;

public class Professor extends Staff {
    private Department department;

    public Professor(String name, Department department) {
        super(name, name);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void printInfo() {
        System.out.println(
                "Professor " + getName() + " belongs to the " + department.getDepartmentName() + " department.");
    }
}