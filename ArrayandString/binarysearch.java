import java.io.*;
import java.util.*;

public class Main{
public static int bin(int a[], int num){
    int st = 0, en = a.length-1;
    while(st <= en){
        int mid  = (st+en)/2;
        if(a[mid] < num){
            st = mid + 1;
        }
        else if(a[mid] > num){
            en = mid - 1;
        }
        else{
            return mid;
        }
    }
    return -1;
}
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < a.length; i++){
        a[i] = scn.nextInt();
    }
    int num = scn.nextInt();

    int res = bin(a,num);
    System.out.println(res);
 }

}