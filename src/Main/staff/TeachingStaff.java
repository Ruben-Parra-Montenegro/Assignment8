package Main.staff;

import Main.university.Staff;
import Main.util.Teachable;

public class TeachingStaff extends Staff implements Teachable {
    private String subject;

    public TeachingStaff(String name, String staffId, String subject) {
        super(name, staffId);
        this.subject = subject;
    }

    public TeachingStaff() {
        super();
        this.subject = "";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Teaching Staff: " + name + ", ID: " + staffId + ", Subject: " + subject);
    }

    @Override
    public void teach() {
        System.out.println("Teaching staff " + getName() + " is teaching.");
    }
}