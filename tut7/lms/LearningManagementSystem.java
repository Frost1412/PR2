package PR2.tut7.lms;

import java.util.ArrayList;

public class LearningManagementSystem  {
    public static void main(String[] args) {
        Student Duong = new Student(12, "Duong","12/10/2004");
        Course course1 = new Course(13, "Lap trinh 2", "Troll", 1412);
        Course course2 = new Course(200, "Xac suat thong ke", "Toan2",1523 );
        Course course3 = new Course(12, "Lap trinh 3", "Decade", 2434);
        ArrayList<Course> bruh = new ArrayList<Course>();
        bruh.add(course1);
        bruh.add(course2);
        bruh.add(course3);
        Duong.setEnrolledCourse(bruh);

        Duong.setGpa(9.6);

        course1.addTranscriptEntry(Duong);
        course2.addTranscriptEntry(Duong);

        System.out.println(Duong.getName());
        System.out.println(Duong.getGpa());

        System.out.println( Duong.getCourse() );
        System.out.println(Duong.getDateOfBirth() );


    }
}
