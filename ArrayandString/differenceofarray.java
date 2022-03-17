import java.io.*;
import java.util.*;

public class Main{
    public static int[] dif(int a1[], int a2[]){
        int n1 = a1.length,n2 = a2.length;
        int a3[] = new int[n2];
        int n3 = a3.length;
        int p1 = n1-1, p2 = n2-1, p3 = n3-1, carry = 0;
        
        while(p3 >= 0){
            int v1 = p1 >= 0 ? a1[p1] : 0;
            int v2 = p2 >= 0 ? a2[p2] : 0;
            int v3 = 0;
            if(v1 <= v2-carry){
                v3 = v2 -v1-carry;
                carry = 0;
            }
            else{
                v2 = v2 + 10;
                v2 = v2 - carry;
                v3 = v2 - v1;
                carry = 1;
            }
            
            a3[p3] = v3;
            p1--;
            p2--;
            p3--;
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
        int res[] = dif(a1,a2);
        int idx = 0;
        while(idx < res.length){
            if(res[idx] == 0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx < res.length){
            System.out.println(res[idx]);
            idx++;
        }
    }

}