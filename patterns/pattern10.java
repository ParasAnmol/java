import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int star = 1;
    int space = n/2;
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= space; j++){
            System.out.print("\t");
        }
        for(int k = 1; k <= star; k++){
            if(k == 1 || k == star){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
        if( i <= n/2){
            star = star + 2;
            space = space - 1;
        }
        else{
            star = star - 2;
            space = space + 1;
        }
    }
 }
}