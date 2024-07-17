package ca.ucalgary.ensf380;

public class Student extends Person {
    private String studentNumber;
    private Professor supervisor;
    private double averageMark;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Professor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll() {
        // Implementation to check if the student is eligible to enroll
        return averageMark >= 50;
    }
}
