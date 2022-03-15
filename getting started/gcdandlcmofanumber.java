import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int t1 = a;
    int t2 = b;
    while(t2 != 0){
      int t3 = t1 % t2;
      t1 = t2;
      t2 = t3;
    }
    System.out.println(t1);
    System.out.println((a*b)/t1);
  }
}
