package PR2.tut12.greeting;



public class GreetingConversation {
    private static GreetingConversation instance;

    private GreetingConversation() {


    }
    public static GreetingConversation getInstance() {
        if(instance == null) {
            instance = new GreetingConversation();
        }
        return instance;
    }

    public static void main(String[] args) {
        Person p1 = new Person(1, "Quan Dang");
        Person p2 = new Person(2, "Thuan Nguyen");
        MobilePhone m1 = new MobilePhone("Apple", "M-ABC-123", Color.Yellow, 2008, false);
        MobilePhone m2 = new MobilePhone("Apple", "M-DUX-872", Color.Red, 2021, true);
        p1.setPhone(m1);
        p2.setPhone(m2);
        p1.greet();
        p2.greet();


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(m1.getColorCode());
        // TODO: test more methods (all the public ones)
    }
}
