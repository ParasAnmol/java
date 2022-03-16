import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {   
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0; i <= a.length-1; i++){
            a[i] = scn.nextInt();
        }
        System.out.println(diff(a));
    }
    public static int diff(int a[]){
        int max = a[0];
        int min = a[0];
        for(int i = 1; i <= a.length-1; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        } 
        return max-min;
    }

}