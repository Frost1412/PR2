package PR2.tut6;

public class TestShape {
    public static void main(String[] args) {

        Rectangle troll = new Rectangle(9 , 10, "Pink");
        System.out.println(troll);
        System.out.println(troll.getArea());

        Triangle a = new Triangle(18, 23, "White");
        System.out.println(a);
        System.out.println(a.getArea());




    }
}
