package PR2.tut12.greeting;

public class Recursive {
    public static void first(int num) {
        System.out.printf("%d, ", num);
        first(num + 2);
    }
    public static void second(int num, int add) {
        System.out.printf("%d, ", num + add);
        second(num + add, add + 1);
    }
    public static void fibonacci(int num, int prev) {
        System.out.printf("%d, ", num + prev);
        if (num == 0) System.out.printf("%d, ", num + ++prev);
        fibonacci(num+prev, num);
    }

}
