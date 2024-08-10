package Array;

public class rollnumber {
    public static void main(String[] args) {
        int[] arr={81,45,67,100,12,34,56,24};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.print(i+ " ");
            }
        }
    }
}
