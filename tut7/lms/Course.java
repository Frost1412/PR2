package PR2.tut7.lms;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseID;
    private String name;
    private String description;
    private int credits;
    private List<Student> academicTranscript;

    // Constructor
    public Course(int courseID, String name, String description, int credits) {
        this.courseID = courseID;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.academicTranscript = new ArrayList<>();
    }

    public void addTranscriptEntry(Student student) {
        academicTranscript.add(student);
    }

    public void removeTranscriptEntry(Student student) {
        academicTranscript.remove(student);
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Student> getAcademicTranscript() {
        return academicTranscript;
    }

    public void setAcademicTranscript(List<Student> academicTranscript) {
        this.academicTranscript = academicTranscript;
    }
    public String toString() {
        return name +"," +courseID +"," + description + "," + credits ;

    }
}
