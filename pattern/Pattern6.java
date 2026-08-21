package pattern;

public class Pattern6 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for (int row=1; row<=n; row++){
            // int st = row > n ? 2*n-row:row;

            int totalSpaces = n-row;
            for(int s=0; s<totalSpaces; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
