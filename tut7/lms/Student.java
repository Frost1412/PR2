package PR2.tut7.lms;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private String dateOfBirth;
    private double gpa;
    private List<Course> enrolledCourses;

    // Constructor
    public Student(int studentID, String name, String dateOfBirth ) {
        if(validateStudentID(studentID)) {
            this.studentID = studentID;
        } else {
            throw new RuntimeException("ten khong hop le");
        }

        if(validateName(name)) {
            this.name = name;
        } else {
            throw new RuntimeException("ten khong hop le");
        }
        if(validatedateOfBirth(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new RuntimeException("Ngay sinh khong hop le");
        }


        this.gpa = 0.0;
        this.enrolledCourses = new ArrayList<>();
    }

    public void setEnrolledCourse(ArrayList<Course> course) {
        if(course.isEmpty()){
            throw new RuntimeException("Dung lai ngay");
        } else {
        enrolledCourses = course;
    }}

    public void removeEnrolledCourse(Course course) {
        enrolledCourses.remove(course);
    }





    private boolean validateStudentID(int studentID) {
        return studentID >1;
    }





    public String getName() {

        return name;
    }

    private boolean validateName(String name) {
        return name.length() < 50;
    }

    private boolean validatedateOfBirth(String dateOfBirth) {
        return dateOfBirth.length() <= 10;
    }

    private boolean validategpa(double gpa) {
        return gpa >= 0.0 && gpa <= 10.0;
    }


    public void setName(String name) {
        if(validateName(name)) {
            this.name = name;
        }else{
            System.out.println("Invalid name");
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if(validatedateOfBirth(dateOfBirth)) {

            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("invalid DOB");

        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (validategpa(gpa)) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid");
        }
    }

   public String getCourse() {
        return enrolledCourses.toString();
   }






}
