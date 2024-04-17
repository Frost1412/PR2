import java.util.Scanner;

public class lmao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( a > b) {
            System.out.println("a lon hon b thang ngu a");
        } else if (a < b) {
          System.out.println("a nho hon b thang ngu a");  
        }  else {
            System.out.println(" a bang b thang bai nao");
        }
        sc.close();


    }
}
