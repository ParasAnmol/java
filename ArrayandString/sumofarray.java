import java.io.*;
import java.util.*;

public class Main{
    public static int[] sum(int a1[], int a2[]){
        int n1 = a1.length, n2 = a2.length;
        int n3 = Math.max(n1,n2);
        int p1 = n1-1, p2 = n2-1, p3 = n3-1,carry = 0;
        int a3[] = new int[n3];
        while(p1 >= 0 || p2 >= 0){
            int v1 = p1 >= 0 ? a1[p1] : 0;
            int v2 = p2 >= 0 ? a2[p2] : 0;
            int v3 = v1 + v2 + carry;
            int digit  = v3 % 10;
            carry = v3 / 10;
            a3[p3] = digit;
            p1--;
            p2--;
            p3--;
        }
        if(carry != 0){
            int a4[] = new int[n3+1];
            a4[0] = carry;
            for(int i = 1; i <= a4.length-1; i++){
                a4[i] = a3[i-1];
            } 
            return a4;
        }
        return a3;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1[] = new int[n1];
        for(int i = 0; i <= a1.length-1; i++){
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int a2[] = new int[n2];
        for(int i = 0; i <= a2.length-1; i++){
            a2[i] = scn.nextInt();
        }

        int res[] = sum(a1,a2);
        for(int val : res){
            System.out.println(val);
        }
    }

}