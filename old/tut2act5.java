package PR2.old;


public class tut2act5 {
    public static void main(String[] args) {
        System.out.println(lowestCommon(0, 0));
    }
    static int lowestCommon(int a, int b) {
        String aString = toBinary(a), bString = toBinary(b);
        boolean aLonger = aString.length() > bString.length();
        for (int i = 0; i < (aLonger ? bString.length() : aString.length()); i++) {
            if (aString.charAt(aString.length() - 1 - i) == bString.charAt(bString.length() - 1 - i)) return i;
        }
        return -1;
    }
    static String toBinary(int a) {
        String res = "";
        while (a > 0) {
            res = (a % 2) + res;
            a = a/2;
        }
        return res;
    }
}















