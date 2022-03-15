import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int d = 0;
    int i = num;
    while(num != 0){
      num = num / 10;
      d++;
    }
    int o = 0;
    for(int m = 1; m <= d; m++){
      int n = i % 10;
      i = i / 10;
      o = o + (m * (int)Math.pow(10,n-1));
    }
    System.out.println(o);
  }
}