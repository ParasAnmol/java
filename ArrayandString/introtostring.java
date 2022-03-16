import java.util.*;

public class Main{
    public static void add1(int n1, int n2){
        System.out.println(n1+n2);
    }
    public static int add1(int n1, int n2){
        return n1+n2;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        add1(num1,num2);
        System.out.println(add2(num1,num2));
    }
}