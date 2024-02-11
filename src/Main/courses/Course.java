package Main.courses;

import Main.university.Department;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String name;
    private Department department;

    private static List<Course> allCourses = new ArrayList<>();

    public Course(String code, String name, Department department) {
        this.code = code;
        this.name = name;
        this.department = department;

        allCourses.add(this);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public static List<Course> getAllCourses() {
        return new ArrayList<>(allCourses);
    }
}