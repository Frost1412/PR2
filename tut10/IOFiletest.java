package PR2.tut10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IOFiletest {
    public static void main(String[] args) throws FileNotFoundException {



        IOFile ha = new IOFile("testdata.txt");
        OutputStream os = new FileOutputStream("output.txt");
        ha.write(os);

        ha.print();
        ha.copy("input.txt");

        System.out.println("The number of Lines is: " + ha.countLines());

        ha.delete("troll.txt");


    }
}
