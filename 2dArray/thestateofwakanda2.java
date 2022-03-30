import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int a[][] = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            int j = 0; int k = i;
            while(k < a.length && j < a[0].length){
                System.out.println(a[j][k]);
                j++;
                k++;
            }
        }
    }

}