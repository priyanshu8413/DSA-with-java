package Recursion.Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if (n==1 || n==0) return 1; // best case
        int ans=n*fact(n-1); //call
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
