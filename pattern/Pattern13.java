package pattern;

public class Pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<n; row++){
            // int totalStar = 2*n;
            
            int space = n-row;
                for(int s=0; s<space; s++){
                System.out.print(" ");
            for(int col=0; col<2*n; col++){
                // int space = n-row;
            //     for(s=0; s<row; s++){
            //     System.out.print(" ");
            // }
                System.out.print("*");
            }
            System.out.println();
    }
    }
}
}