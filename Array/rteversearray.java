package Array;

public class rteversearray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int ele:arr)
        {
            System.out.println(ele+ " ");
        }
        System.out.println();
        //reverse
       int i=0,j=n-1;
       while(i<=j)
       {
           swap(arr,i,j);
          // int temp=arr[i];
           //arr[i]=arr[j];
           //arr[j]=temp;
           i++;
           j--;
       }
        for(int ele : arr)
        {
            System.out.println(ele+ " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
