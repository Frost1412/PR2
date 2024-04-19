package PR2.old;
import java.util.Scanner;
public class tut2act2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so quarters cua m vao: ");
        int a = sc.nextInt();
        System.out.print("Nhap so dimes cua m vao: ");
        int b = sc.nextInt();
        System.out.print("Nhap so nickels cua m vao: ");
        int c = sc.nextInt();
        System.out.print("Nhap so pennies cua m vao: ");
        int d = sc.nextInt();

        double trolltong = tinhtrolltong(a, b, c,d);
        System.out.println("Tien cua m la: $" + trolltong);

    }

    public static double tinhtrolltong(int a, int b, int c, int d) {
        double quarters = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penni = 0.01;
        double trolltong =  (a * quarters) + (b * dime) + (c *nickel) + (d *penni);
         return  trolltong;

    }
}
