package PR2;
public class tut2act1 {
    public static void main(String[]args){
        int a = (int) (Math.random() *6) + 1;
        int b = (int) (Math.random() *6) + 1;
        int c = a + b;
        System.out.println("The first die ccomes up " + a );
        System.out.println("The second die ccomes up " +b);
        System.out.println("Your total roll is " + c);
    }

}
