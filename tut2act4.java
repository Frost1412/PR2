package PR2;

import java.util.Arrays;


public class tut2act4 {
    public static void main(String[] args) {
        int[][] a = {{14,12,34,12},
                     {15,47,78,99},
                     {1,4,6,3},
                     {5,7,9,6} };
        troll(a);
    }

    public static int[][] troll(int[][] a){
        int b[][] = new int[a[0].length][a.length];
        for(int i=0; i<a.length; i++){
            for(int k=0; k<a[0].length; k++){
                b[k][i] = a[i][k];
            }
        }
        for (int bua = 0; bua<b.length; bua++){
            System.out.println(Arrays.toString(b[bua]));
        }
        return b;

    }

}


