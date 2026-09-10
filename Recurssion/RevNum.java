package Recurssion;

public class RevNum {
    public static void main(String[] args) {
        
        System.out.println(reverse(34235));
    }
    static int reverse(int n){
        if(n==0){
            return 0;
        }
        int ans = n%10 + reverse(n/10);
         return ans;
    }
}
