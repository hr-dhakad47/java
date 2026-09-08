package Recurssion;
//program to print number from 1-n
public class Q2 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
        return ;
        }
        fun(n-1);
        System.out.println(n);
    } 
}
