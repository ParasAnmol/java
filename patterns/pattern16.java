import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int star = 1, space = 2*n-3,num = 1;
    for (int i = 1; i <= n; i++) {
        num = 1;
        for (int j = 1; j <= star; j++) {
            System.out.print(num+"\t");
            num++;
        }
        for (int j = 1; j <= space; j++) {
            System.out.print("\t");
        }
        if(i == n ){
            star--;
            num--;
        }
        for (int j = 1; j <= star; j++) {
            num--;
            System.out.print(num+"\t");
        }
        star++;
        space = space - 2;
        System.out.println();
    }
 }
}