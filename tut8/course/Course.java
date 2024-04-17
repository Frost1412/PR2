package PR2.tut8.course;

import PR2.tut8.person.Student;

import java.util.ArrayList;
import java.util.List;

public class Course implements StudentManageable{
    int courseID;
    String name;
    int credits;
    List<Student> enrolledStudents = new ArrayList<>();
    department department;
    semester semester;

    public void addStudent(Student a) {
        enrolledStudents.add(a);
    }

    public void removeStudent(Student a) {
        enrolledStudents.remove(a);
    }

    public void getEnrolledStudent() {
        for(Student a: enrolledStudents){
            System.out.println(a);
        }
    }


    public enum department{
        FIT,
        FIS,
        FMT,
        ESPD
    }
    public enum semester{
        FIRST,
        SECOND,
        THIRD
    }

    public Course(int courseID,String name,int credit, department a, semester b){
        this.name = name;
        this.courseID = courseID;
        this.credits = credit;
        this.semester = b;
        this.department = a;
    }


    public String toString(){
        return name+", "+credits+", "+courseID+", "+department;
    }

}