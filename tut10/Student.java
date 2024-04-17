package PR2.tut10;

import java.io.Serializable;

public class Student  implements Serializable {
    private String name;
    private double mark;
    private String faculty;


    public Student(String name, double mark, String faculty) {
        if(validatename(name)) {
            this.name = name;
        } else {
            throw new RuntimeException("Ten khong dung");
        }
        if(validatemark(mark)) {
            this.mark = mark;

        } else {
            throw new RuntimeException("Diem tron a");
        }
        if(validatefaculty(faculty)) {
            this.faculty = faculty;
        } else {
            throw new RuntimeException("Khoa gi day?");
        }
    }

    private boolean validatename(String name) {
        return name.length() > 0 && name.length() < 50;
    }

    private boolean validatemark(double mark) {
        return mark >= 0.0 && mark <= 10.0;
    }
    private boolean validatefaculty(String faculty) {
        return faculty.length() < 20;
    }





}

