import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n/2+1;
        int space  = 1;
        for (int i = 1; i <= n; i++) {
            for( int j =1 ;j <= star  ;j++  ) {
                System.out.print("*\t");
            }
            for( int k = 1 ;k <= space  ;k++  ) {
                System.out.print("\t");
            }
            for( int j =1 ;j <= star  ;j++  ) {
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= n/2){
                star = star -1;
                space = space + 2;
            }
            else{
                star = star + 1;
                space = space - 2;
            }
        }
    }
}