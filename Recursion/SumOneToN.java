package Recursion.Recursion;

import java.util.Scanner;

public class SumOneToN {
    public static void print(int n,int s){
      if(n==0){//best case
          System.out.println(s);
          return ;

      }

      print(n-1,s+n);//call and work

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        print(n,0);
    }
}
