package Recursion;

public class DigitProduct {

    public static void main(String[] args) {
        System.out.println(digitSum(565));
    }
    static int digitSum(int n){
        if(n%10 ==n){
            return n;
        }
        return n%10 * digitSum(n/10);
    }
}


