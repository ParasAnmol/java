import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int third = first + second;
                System.out.print(first+ "\t");
                first = second;
                second = third;
            }
            System.out.println();
        }
    }
}