package PR2.tut10;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class xfiletest  {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
//        byte[] data = XFile.read("hello.txt");
//        XFile.write("output.txt", data);


        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuấn",9.0,"CNTT"));
        list.add(new Student("Dương", 10.0, "CNTT"));
        list.add(new Student("Định", 8.5, "CNTT"));

        XFile.writeObject("output.txt", list);


    }
}
