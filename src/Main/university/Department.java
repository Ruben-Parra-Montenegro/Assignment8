package Main.university;

import java.util.ArrayList;
import java.util.List;

import Main.courses.Course;

public abstract class Department {
    private String departmentName;
    private List<Course> courses = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

}