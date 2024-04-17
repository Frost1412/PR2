package PR2.a1_2201040048;
import java.util.Arrays;
import java.util.Random;
public class CoffeeTinGame {

    private static final char GREEN = 'G';
    private static final char BLUE = 'B';
    private static final char REMOVED = '-';
    private static final char NULL = '\u0000';


    private static char[] BeansBag = new char[30];

    static {
        for(int i = 0; i<30; i++) {
            if(i < 10) {
                BeansBag[i] = BLUE;
            } else if (i < 20) {
                BeansBag[i] = GREEN;
            } else {
                BeansBag[i] = REMOVED;
            }

        }

    }


    public static void main(String[] args) {
//        System.out.println("Code này của Kim Định viết đứa nào copy dính bản quyền ngay ");



        char[][] tins = {
                {BLUE, BLUE, BLUE, GREEN, GREEN},
                {BLUE, BLUE, BLUE, GREEN, GREEN, GREEN},
                {GREEN},
                {BLUE},
                {BLUE, GREEN}
        };

        for (int i = 0; i < tins.length; i++) {
            char[] tin = tins[i];


            int greens = 0;
            for (char bean : tin) {
                if (bean == GREEN)
                    greens++;
            }
            final char last = (greens % 2 == 1) ? GREEN : BLUE;

            System.out.printf("%nTIN (%d Gs): %s %n", greens, Arrays.toString(tin));


            char lastBean = tinGame(tin);

            System.out.printf("tin after: %s %n", Arrays.toString(tin));

            if (lastBean == last) {
                System.out.printf("last bean: %c%n", lastBean);
            } else {
                System.out.printf("Oops, wrong last bean: %c (expected: %c)%n", lastBean, last);
            }
        }
    }

    public static char tinGame(char[] tin) {
        while (hasAtLeastTwoBeans(tin)) {
            char[] twoBeans = takeTwo(tin);
            char b1 = twoBeans[0];
            char b2 = twoBeans[1];

           updateTin(tin, b1,b2);
        }
        return anyBean(tin);
    }


    public static boolean hasAtLeastTwoBeans(char[] tin) {
        int count = 0;
        for (char bean : tin) {
            if (bean != REMOVED) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    private static char[] takeTwo(char[] tin) {
        char first = takeOne(tin);
        char second = takeOne(tin);
        return new char[]{first, second};
    }

    public static char takeOne(char[] tin) {
        int a = randInt(tin.length);
        while(tin[a] == REMOVED) {
            a = randInt(tin.length);
        }
        char bean = tin[a];
        tin[a] = REMOVED; 
        return bean;
    }

    private static void putIn(char[] tin, char bean) {
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] == REMOVED) {
                tin[i] = bean;
                break;
            }
        }
    }

    private static char anyBean(char[] tin) {
        for (char bean : tin) {
            if (bean != REMOVED) {
                return bean;
            }
        }
        return NULL;
    }
    public static int randInt(int n) {
        Random r = new Random();
        return r.nextInt(n);
    }

    public static char getBean (char[] beansBag, char beanType ) {
        int troll = randInt(beansBag.length);
        char chon = beansBag[troll];
        while (chon != beanType) {
            troll = randInt(beansBag.length);
            chon = beansBag[troll];
        }
        beansBag[troll] = REMOVED;
        return chon;


    }

    public static void updateTin(char[] tin, char so1, char so2) {



        if ( so1 == so2) {
            char newBlue = getBean(BeansBag, BLUE);
            putIn(tin, newBlue);
        } else {
            putIn(tin, GREEN);
        }


    }



}





