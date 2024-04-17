package PR2.tut6;

public class TestMonster {
    public static void main(String[] args) {



        FireMonster a = new FireMonster( "lum mi");
            System.out.println(a);
            System.out.println(a.attack());

        WaterMonster b = new WaterMonster("a du");
        System.out.println(b);
        System.out.println(b.attack());

        StoneMonster c = new StoneMonster("a van du");
        System.out.println(c);
        System.out.println(c.attack());

    }
}
