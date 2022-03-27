import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1, space = n/2;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            int temp = num;
            for (int k = 1; k <= star; k++) {
                
                System.out.print(temp+"\t");
                if(k <= star/2){
                    temp++;
                }
                else{
                    temp--;
                }
            }
            System.out.println();
            if(i <= n/2 ){
                star = star + 2;
                space--;
                num++;
            }
            else{
                star = star - 2;
                space++;
                num--;
            }
        }
    }
}