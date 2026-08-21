package pattern;

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=0; row<n; row++){
            int totalSpaces=n-row;
            for(int s=0; s<totalSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0; col<row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
