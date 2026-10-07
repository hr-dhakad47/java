package Recursion.questions;

public class n_to_1 {
    public static void main(String[] args) {
        num(5);
    }
    // program to print numbers n to 1
    static void num(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        num(n-1);
    }
    // program to print numbers 1 to n
    //  static void num(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     num(n-1);
    //     System.out.println(n);
    // }
    
}
