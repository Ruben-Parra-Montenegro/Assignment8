package Main.university;

public class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public Student() {
        super();
        this.studentId = "";
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void display() {
        System.out.println("Student: " + name + ", ID: " + studentId);
    }
}