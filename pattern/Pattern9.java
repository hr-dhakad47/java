package pattern;

public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=0; row<=n; row++){
            // int totalSpaces = n-row;
            for(int s=0; s<row; s++){
                System.out.print(" ");
            }
            //  System.out.print("*");
            int stars = 2 * (n - row) + 1;
            for(int col=0; col<stars; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.println("     *");
    }
}
