package Main.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private List<Department> departments;

    public University() {
        this.universityName = "University of Science and Technology";
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public String getUniversityName() {
        return universityName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void printDepartmentNames() {
        for (Department department : departments) {
            System.out.println(department.getDepartmentName());
        }
    }
}