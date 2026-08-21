package pattern;

public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<n; row++){
            int totalSpaces = row-1;
            for(int s=0; s<totalSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0; col<n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
