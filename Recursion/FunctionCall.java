package Recursion.Recursion;

public class FunctionCall {
    public static void banana(){
        System.out.println("Hi I am banana");
    }
 public static void apple(){
     System.out.println("Hi i am apple");
     banana();
 }
    public static void main(String[] args) {
        System.out.println("hi I am in main method");
        apple();
    }
}
