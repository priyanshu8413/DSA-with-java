package Recursion.Recursion;

public class Pre_in_post {
    public  static void pip(int n){
        if(n==0) return ;
        System.out.println("Pre:"+n);//pre
        pip(n-1);
        System.out.println("IN:"+n);//IN
        pip(n-1);
        System.out.println("Post"+n);//Post

    }
    public static void main(String[] args) {
        pip(3);
    }

}
