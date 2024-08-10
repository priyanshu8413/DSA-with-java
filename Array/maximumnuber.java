package Array;

public class maximumnuber
{
    public static void main(String[] args) {
        int[] arr={-1,8,43,12,5,56,3};
        int n=arr.length;
        //int max=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          // if(arr[i]>max)
           // {
             //  max=arr[i];
            //
            //}
            max=Math.max(max ,arr[i]);
        }
        System.out.println(max);
    }
}
