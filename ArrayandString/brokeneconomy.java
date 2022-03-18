import java.io.*;
import java.util.*;

public class Main{
public static void be(int[] a, int k){
    int st = 0, ed = a.length-1;
    int ceil = 0, floor = 0;
    while(st <= ed){
        int mid = (st + ed)/2;
        if(a[mid] < k){
            st = mid + 1;
            floor = a[mid];
        }
        else if(a[mid] > k){
            ed = mid - 1;
            ceil = a[mid];
        }
        else{
            ceil = a[mid];
            floor = a[mid]; 
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
}
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for (int i = 0; i <= a.length-1; i++) {
        a[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    be(a,k);
 }

}