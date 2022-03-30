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

        int r = 0, c = 0;
        int d = 0;
        while(r >= 0 && r < a.length && c >= 0 && c < a[0].length){
            d = (d + a[r][c]) % 4;
            if (d == 0) {
                c++;
            }
            else if(d == 1){
                r++;
            }
            else if(d == 2){
                c--;
            }
            else{
                r--;
            }
        }

        if (d == 0) {
            c--;
        }
        else if(d == 1){
            r--;
        }
        else if(d == 2){
            c++;
        }
        else{
            r++;
        }
        System.out.println(r);
        System.out.println(c);
    }

}