package Recursion.Recursion;

import java.util.ArrayList;

public class subset {
    static ArrayList<String> arr= new ArrayList<>();
    public static void printsubset(int i, String s , String ans ){
        if(i==s.length()){
           arr.add(ans);
            return;

        }
        char ch= s.charAt(i);
        printsubset(i+1,s,ans+ch);// not take
        printsubset(i+1,s,ans);//take


    }
    public static void main(String[] args) {
       String s= "abc";
       arr = new ArrayList<>();
       printsubset(0,s,"");
        System.out.print(arr);

    }
}
