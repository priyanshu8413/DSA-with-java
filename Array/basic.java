package Array;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
       //input ->loop
       for(int i=0;i<=n;i++)
       {
           arr[i]=sc.nextInt();
       }
       for (int i=0;i<=n;i++)
       {
           System.out.println(arr[i] +" ");
       }
    }
}
