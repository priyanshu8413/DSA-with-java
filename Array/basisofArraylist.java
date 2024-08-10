package Array;

import java.util.ArrayList;

public class basisofArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(0,10);//arr[0]=10
        arr.add(1,60);
        arr.add(2,20);
        arr.add(3,30);
        arr.add(4,40);
        arr.add(5,50);
        //System.out.println(arr);
        for(int i=0;i<=5;i++) {
            System.out.println(arr.get(i)+ ""); //arr[i]
        }
        System.out.println();
        arr.set(2,300);
        for(int i=0;i<=5;i++){
            System.out.println(arr.get(i)+" ");
        }
        arr.add(90);
        System.out.println();
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
    }
}
