package Recursion.Recursion;

import java.util.Scanner;

public class sumoneton2 {
    public static int sum(int n){
        if (n==1 || n==0) return n; // best case
        int ans=n+sum(n-1); //call
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }

}
