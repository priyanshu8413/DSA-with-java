package Recursion.Recursion;

public class skip_a_character {
    public static void skip(int i , String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
       if(s.charAt(i)!='a') ans+=s.charAt(i);
        skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s= "Priyanshu Raj";
        skip(0,s,"");
    }
}
