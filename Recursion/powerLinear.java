package Recursion.Recursion;

import java.util.Scanner;

public class powerLinear {

        public static int pow(int a,int b){

            if ( b==0) return 1; // best case
            int ans=a*pow(a,b-1); //call
            return ans;
        }
    public static int pow2(int a,int b){

        if ( b==0) return 1; // best case
        int ans=pow2(a,b/2); //call
        if(b%2==0) return ans*ans;
       else  return ans*ans+a;
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the base");
            int a=sc.nextInt();
            System.out.println("Enter the power");
            int b=sc.nextInt();
            System.out.println(a+"raised to the power" + b +" is "+pow(a,b));



        }

    }
