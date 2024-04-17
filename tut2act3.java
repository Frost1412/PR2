package PR2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class tut2act3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("testdata.txt"));
        String ten = sc.nextLine();
        int diem1 = sc.nextInt();
        int diem2 = sc.nextInt();
        int diem3 = sc.nextInt();

        double trungbinh = (diem1 + diem2 + diem3) / 3.0;
        System.out.println(ten);
        System.out.println(trungbinh);
        sc.close();




    }


}
