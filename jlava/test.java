import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        for ( int i = a; i <=b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            } 
        }
	}
}
