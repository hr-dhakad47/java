package pattern;

public class Pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=n; row>=1; row--){
            for (int s=1; s<=n-row; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                if(row==n || col==1 || col==2*row-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
