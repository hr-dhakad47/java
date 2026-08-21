import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println("The sum is: " + ans);
    }
    // return type function
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to find their sum: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum2 = num1 + num2;
        return sum2;
    }
    // non-return type function
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to find their sum: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
