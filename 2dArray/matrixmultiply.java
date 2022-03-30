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

    public static int[][] mult(int a1[][],int  a2[][]){
      int r1 = a1.length, c1 = a1[0].length;
      int r2 = a2.length, c2 = a2[0].length;
      int res[][] = new int[r1][c2];

      for(int i = 0; i < res.length; i++){
        for (int j = 0; j < res[0].length; j++) {
          for (int k = 0; k < c1; k++) {
            res[i][j] = res[i][j] + (a1[i][k] * a2[k][j]);
          }
        }
      }

      return res;
    }

    public static void display(int a[][]){
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
      }
    }
  
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int m1 = scn.nextInt();
      int a1[][] = new int[n1][m1]; 

      int res1[][] = input(a1,scn);

      int n2 = scn.nextInt();
      int m2 = scn.nextInt();
      int a2[][] = new int[n2][m2]; 

      int res2[][] = input(a2,scn);
      if(res1[0].length == res2.length){
        int res[][]  = mult(res1,res2);
        display(res);
      }
      else{
        System.out.println("Invalid input");
      }
    }
  }