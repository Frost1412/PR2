package PR2.tut8.person;

import java.util.ArrayList;

public class testStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>() ;
         Student Duong =  new Student(12,35,"Duong", "26/11/2004");
         Student Tuan = new Student(14,24,"Tuan", "10/12/2004");
         Student Dinh = new Student(25, 45,"Dinh", "14/12/2004");

        Duong.setGpa(3.1);
        Tuan.setGpa(2.8);
        Dinh.setGpa(2.9);

        students.add(Duong);
        students.add(Tuan);
        students.add(Dinh);





        students.sort(new Student.SortByGPA());

        for (Student student : students) {
            System.out.println(student.toString());
        }


    }


}
