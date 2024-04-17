package PR2.tut8.person;

import PR2.tut7.lms.Course;

import java.util.Comparator;
import java.util.List;

public class Student extends Person {
    private int studentID;
    private double gpa;
    private List<Course> enrolledCourses;


    public Student(int id,int studentID, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
        if(validatestudentID(studentID)) {
            this.studentID = studentID;
        } else {
            throw new RuntimeException("Lum mi");
        }



    }

    private boolean validatestudentID(int studentID) {
        return studentID > 1;
    }
    public void setGpa(double gpa) {
        if(validategpa(gpa)) {
            this.gpa = gpa;
        } else {
            throw new RuntimeException("? gpa");
        }

    }

    private boolean validategpa(double gpa) {
       return  0.0 <= gpa && gpa <= 4.0;
    }
    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return studentID + "," + getName() + "," + gpa;
    }



    public static class SortByGPA implements Comparator<Student> {

        public int compare(Student p1, Student p2) {
            return Double.compare(p1.getGpa(), p2.getGpa());
        }
    }




}
