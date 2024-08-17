package Arrayin2d;

import java.util.Scanner;

public class Outputin2DArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr=new int[3][3];
        int m=arr.length;//no. of rows/lines
        int n=arr[0].length;//no of column
        System.out.println(n);
        System.out.println(m);
        for(int i=0;i<3;i++)//rows
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
//output of 2d array
        for(int i=0;i<3;i++)//rows
        {
          for(int j=0;j<3;j++)
          {
              System.out.print(arr[i][j]+" ");
          }
            System.out.println();
        }
    }
}
