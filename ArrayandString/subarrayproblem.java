import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i <= arr.length-1; i++){
        arr[i] = scn.nextInt();
    }

    for(int i = 0; i <= arr.length-1; i++){
        for(int j = i; j <= arr.length-1; j++){
            for(int k = i; k <= j; k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}

                                        or

                                        import java.io.*;
import java.util.*;

public class Main{
    public static void subarray(int arr[]){
        for(int i = 0; i <= arr.length-1; i++){
        for(int j = i; j <= arr.length-1; j++){
            for(int k = i; k <= j; k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = scn.nextInt();
        }

        subarray(arr);
    }

}