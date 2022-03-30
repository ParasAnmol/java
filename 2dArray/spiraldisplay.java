import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        int rmin = 0, rmax = a.length-1, cmin = 0, cmax = a[0].length-1;
        int elements = a.length * a[0].length;
        int count = 0;

        while ( count  < elements ) {

            for(int r = rmin; r <= rmax && count < elements; r++){
                count++;
                System.out.println(a[r][cmin]);
            }

            for(int c = cmin+1; c <= cmax && count < elements; c++){
                count++;
                System.out.println(a[rmax][c]);
            }

            for(int r = rmax-1; r >= rmin && count < elements; r--){
                count++;
                System.out.println(a[r][cmax]);
            }

            for(int c = cmax-1; c >= cmin+1 && count < elements; c--){
                count++;
                System.out.println(a[rmin][c]);
            }

            rmin++;
            rmax--;
            cmin++;
            cmax--;
        }
    }

}