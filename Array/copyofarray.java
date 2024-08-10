package Array;

import java.util.Arrays;

public class copyofarray {
    public static void main(String[] args) {
        int[] arr= {30,10,40,23,89,34};
        for(int ele : arr){
            System.out.println(ele+" ");
        }
        System.out.println();
       // int[] nums=arr;//shallow copy
        //for(int i=0;i<nums.length;i++)
        //{
          //  System.out.println(nums[i]+" ");
        //}
        //deep copy
        int[] brr= Arrays.copyOf(arr,arr.length);
        brr[0]=70;
        System.out.println(arr[0]);
    }
}
