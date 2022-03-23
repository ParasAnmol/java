import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n/2+1;
        for( int i =1 ;i <= n  ;i++  ) {
            for( int j = 1 ;j <= star  ;j++  ) {
                if(j > n/2 || i == n/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            if(i <= n/2){
                star++;
            }
            else{
                star--;
            }
        }
    }
}