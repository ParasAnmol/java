import java.util.*;
  
  public class Main {
  
  	  public static void main(String[] args) {
  	  	//   Write your code here
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int e = (int)Math.pow(a,2);
		int f = (int)Math.pow(b,2);
		int g = (int)Math.pow(c,2);
		if((e == f + g) || (f == e + g) || (g == e + f)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
  	  }
  }