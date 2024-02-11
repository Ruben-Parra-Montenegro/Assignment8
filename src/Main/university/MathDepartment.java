package Main.university;

import Main.courses.Course;

public class MathDepartment extends Department {
    public MathDepartment() {
        super("Mathematics");
        createCourses();
    }

    private void createCourses() {
        Course calculus = new Course("MATH101", "Calculus", this);
        Course algebra = new Course("MATH102", "Algebra", this);
        Course geometry = new Course("MATH103", "Geometry", this);

        addCourse(calculus);
        addCourse(algebra);
        addCourse(geometry);
    }
}