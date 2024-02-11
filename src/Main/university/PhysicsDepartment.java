package Main.university;

import Main.courses.Course;

public class PhysicsDepartment extends Department {
    public PhysicsDepartment() {
        super("Physics");
        createCourses();
    }

    private void createCourses() {
        Course mechanics = new Course("PHYS101", "Mechanics", this);
        Course electromagnetism = new Course("PHYS102", "Electromagnetism", this);
        Course thermodynamics = new Course("PHYS103", "Thermodynamics", this);

        addCourse(mechanics);
        addCourse(electromagnetism);
        addCourse(thermodynamics);
    }
}