package Recursion.introduction;

public  class Number {
    public static void main(String[] args) {
        // num1();
        num(1);
    }
//     static  void num1(){
//         System.out.println("1");
//         num2();
//     }
//     static  void num2(){
//         System.out.println("2");
//         num3();
//     }
//     static  void num3(){
//         System.out.println("3");
//         num4();
//     }
//     static  void num4(){
//         System.out.println("4");
//         num5();

//     }
//     static  void num5(){
//         System.out.println("5");
//     }

// Lets make this program easy to see and underdestand by converting this entire program into Recursion

static void num(int n){
    if(n>5)
        // this is the base condition which tell recursion to stop making new call
        {
            return;
        }
        
        System.out.println(n);
        num(n+1);
    }
}