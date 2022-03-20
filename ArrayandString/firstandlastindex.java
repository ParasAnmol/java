import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn .nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
        a[i] = scn.nextInt();
    }
    int num = scn.nextInt();
    int st = 0, ed = a.length-1;
    int fi = -1;
    while(st <= ed){
        int mid = (st + ed)/2;
        if(a[mid] < num ){
            st = mid + 1;
        }
        else if(a[mid] > num){
            ed = mid - 1;
        }
        else{
            fi = mid;
            ed = mid - 1;
        }
    }
    System.out.println(fi);
    st = 0;
    ed = a.length-1;
    int li = -1;
    while(st <= ed){
        int mid = (st + ed)/2;
        if(a[mid] < num ){
            st = mid + 1;
        }
        else if(a[mid] > num){
            ed = mid - 1;
        }
        else{
            li = mid;
            st = mid + 1;
        }
    }
    System.out.println(li);
    
 }

}