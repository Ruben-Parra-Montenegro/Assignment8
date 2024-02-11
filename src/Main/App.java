package Main;

import Main.university.*;
import Main.courses.*;
import Main.staff.*;

public class App {
    public static void main(String[] args) {

        MathDepartment mathDept = new MathDepartment();
        PhysicsDepartment physicsDept = new PhysicsDepartment();

        University university = new University();
        university.addDepartment(mathDept);
        university.addDepartment(physicsDept);

        university.printDepartmentNames();

        Professor prof = new Professor("John Doe", mathDept);

        prof.printInfo();

        System.out.println("Courses offered by Math Department:");
        for (Course course : mathDept.getCourses()) {
            System.out.println(course.getName());
        }

        System.out.println("All courses and their departments:");
        for (Course course : Course.getAllCourses()) {
            System.out.println(course.getName() + " is offered by the " + course.getDepartment().getDepartmentName()
                    + " department.");
        }
    }
}