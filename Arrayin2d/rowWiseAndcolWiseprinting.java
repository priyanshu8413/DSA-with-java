package Arrayin2d;

public class rowWiseAndcolWiseprinting {
    public static void main(String[] args) {
     int[][] arr={{1,2},{3,4},{5,6}};
     int m=arr.length;
     int n=arr[0].length;

        for(int j=0;j<n;j++)//column
        {
            for (int i = 0; i <m ; i++) {//row
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        int[][] transpose=new int[n][m];
        for(int j=0;j<n;j++)//column
        {
            for (int i = 0; i <m ; i++) {//row
                transpose[j][i]=arr[i][j];
                System.out.print(transpose[j][i]+" ");

            }
            System.out.println();
        }

    }
}
