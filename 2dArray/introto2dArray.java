import java.util.*;
  
  public class Main{
    public static int[][] input(int a[][], Scanner scn){

      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
          a[i][j] = scn.nextInt();
        }
      }
      return a;
    }
    public static void display(int a[][]){
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int m = scn.nextInt();
      int n = scn.nextInt();
      int a[][] = new int[m][n];
      int res[][] = input(a,scn);
      display(res);
    }
}