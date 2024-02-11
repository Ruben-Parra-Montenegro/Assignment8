package Main.staff;

import Main.university.Staff;

public class NonTeachingStaff extends Staff {
    private String jobTitle;

    public NonTeachingStaff(String name, String staffId, String jobTitle) {
        super(name, staffId);
        this.jobTitle = jobTitle;
    }

    public NonTeachingStaff() {
        super();
        this.jobTitle = "";
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void display() {
        System.out.println("Non-Teaching Staff: " + name + ", ID: " + staffId + ", Job Title: " + jobTitle);
    }
}