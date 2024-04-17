
package PR2.a1_2201040048;

import java.util.Arrays;
import java.util.Random;

public class testCoffeeTinGame {
    private static final char GREEN = 'G';
    private static final char BLUE = 'B';
    private static final char REMOVED = '-';
    private static final char NULL = '\u0000';
    private static final char[] BeansBag;

    static {
        // Initialise BeansBag with roughly one third blue beans, one third green beans, and one third empty spaces
        int bagLength = 30;
        int blueBeans = bagLength / 3;
        int greenBeans = bagLength / 3;
        int emptySpaces = bagLength - blueBeans - greenBeans;
        BeansBag = new char[bagLength];

        Arrays.fill(BeansBag, 0, blueBeans, BLUE);
        Arrays.fill(BeansBag, blueBeans, blueBeans + greenBeans, GREEN);
        Arrays.fill(BeansBag, blueBeans + greenBeans, bagLength, REMOVED);
    }

    public static void main(String[] args) {
        char[][] tins = {
                {BLUE, BLUE, BLUE, GREEN, GREEN},
                {BLUE, BLUE, BLUE, GREEN, GREEN, GREEN},
                {GREEN},
                {BLUE},
                {BLUE, GREEN}
        };

        for (char[] tin : tins) {
            int greens = countBeans(tin, GREEN);
            char last = (greens % 2 == 1) ? GREEN : BLUE;

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

            if (b1 == b2) {
                putIn(tin, BLUE);
            } else {
                putIn(tin, GREEN);
            }
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

    public static char[] takeTwo(char[] tin) {
        char first = takeOne(tin);
        char second = takeOne(tin);
        return new char[]{first, second};
    }

    public static char takeOne(char[] tin) {
        for (int i = 0; i < tin.length; i++) {
            char bean = tin[i];
            if (bean != REMOVED) {
                tin[i] = REMOVED;
                return bean;
            }
        }
        return NULL;
    }

    public static void putIn(char[] tin, char bean) {
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] == REMOVED) {
                tin[i] = bean;
                break;
            }
        }
    }

    public static char anyBean(char[] tin) {
        for (char bean : tin) {
            if (bean != REMOVED) {
                return bean;
            }
        }
        return NULL;
    }

    public static int randInt(int n) {
        Random rand = new Random();
        return rand.nextInt(n + 1);
    }

    public static char getBean(char[] beansBag, char beanType) {
        int index = randInt(beansBag.length - 1);
        char selectedBean = beansBag[index];
        while (selectedBean != beanType) {
            index = randInt(beansBag.length - 1);
            selectedBean = beansBag[index];
        }
        beansBag[index] = REMOVED;
        return selectedBean;
    }

    public static void updateTin(char[] tin, char bean1, char bean2) {
        char desiredBean = getBean(BeansBag, bean1);
        if (bean1 == bean2) {
            putIn(tin, BLUE);
        } else {
            putIn(tin, desiredBean);
        }
    }

    // Other utility methods if needed

    public static int countBeans(char[] tin, char beanType) {
        int count = 0;
        for (char bean : tin) {
            if (bean == beanType) {
                count++;
            }
        }
        return count;
    }
}

