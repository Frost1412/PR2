package PR2.tut9;

// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************
import java.util.Scanner;
public class CountLetters
{
        public static void main(String[] args)
        {
            int[] counts = new int[26];
            Scanner scan = new Scanner(System.in);
            //get word from user
            System.out.print("Enter a single word (letters only, please): ");
            String word = scan.nextLine();
            //convert to all upper case
            word = word.toUpperCase();
            //count frequency of each letter in string

            int t = 0;
            StringBuilder sb = new StringBuilder(word.length());
            while (t != word.length()) {

                try {
                    for (int i = t;  i < word.length(); i++) {
                        counts[word.charAt(i) - 'A']++;
                        t++;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    sb.append(word.charAt(t));
                    t++;
                }
            }
            System.out.println("M troll a: " + sb);

            //print frequencies
            System.out.println();
            for (int i=0; i < counts.length; i++)
                if (counts [i] != 0)
                    System.out.println((char)(i +'A') + ": " + counts[i]);
        }
}

