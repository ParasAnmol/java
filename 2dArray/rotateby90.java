import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int rmin = 0, cmin = 0, rmax = arr.length-1, cmax = arr[0].length-1;

        while(rmin < rmax && cmin < cmax){

            for (int c = cmin; c <= cmax; c++) {
                if(c != rmin){
                    int i = arr[rmin][c];
                    int j = arr[c][rmin];
                    arr[rmin][c] = j;
                    arr[c][rmin] = i;
                }
            }

            for (int r = rmin+1; r <= rmax; r++) {
                if(r != cmax){
                    int i = arr[r][cmax];
                    int j = arr[cmax][r];
                    arr[r][cmax] = j;
                    arr[cmax][r] = i;
                }
            }
            rmin++;
            cmin++;
            cmax--;
            rmax--;
        }

        for (int i = 0; i < arr.length; i++) {
            int j = 0, k = arr.length-1;
            while(j < k){
                int s = arr[i][j];
                int d = arr[i][k];
                arr[i][j] = d;
                arr[i][k] = s;
                j++;
                k--;
            }
        }
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}