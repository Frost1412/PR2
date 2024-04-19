package PR2.old;
import java.util.Scanner;
public class ex3tut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/12;
        int c = a % 12;
        int d = a/144;
        if( a < 12) {
            System.out.println("Ban co " + a + " qua trung");
        }
        if( a > 144 ){
            System.out.println("Ban co " + d + " gross" + ((a - 144*d)/12) + " dozen" + c + " qua thua" );
        }
        if ( 12 < a && a < 144) {
            System.out.println("Ban co " + b + " dozen" + " va " + c + " qua thua");
        } else if ( a == 12) {
            System.out.println("Ban co 12 qua trung or 1 dozen");
        } else if ( a == 144 ){
            System.out.println("Ban co 1 gross");
        }
    }
}
