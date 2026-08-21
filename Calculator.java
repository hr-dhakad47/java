import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Ans = 0;
        while(true){
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op =='-' || op == '*' || op == '/'){
                System.out.println("Enter 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    Ans = num1 + num2;
                }
                if(op == '-'){
                    Ans = num1 - num2;  
                if (op == '*') {
                    Ans = num1 * num2;
                }    
                if(op == '/'){
                    Ans = num1 / num2;
                }

                }
                
                System.out.println("Answer: " + Ans);
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operation");
            }
    }
}
}