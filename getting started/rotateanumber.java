import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int r = scn.nextInt();
    int d = 0;
    int n = num;
    while(num != 0){
    num = num / 10;
    d++;
    } 
    r = r % d;
    if(r < 0){
      r = r + d;
    }

    int temp = (int)Math.pow(10,r);
    int p1 = n % temp;
    int p2 = n / temp;
    int ans = p2 + (p1 * (int)Math.pow(10, d-r));
    System.out.println(ans);
  }
}