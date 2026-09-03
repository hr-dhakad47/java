package pattern;

public class Pattern11 {
    public static void main(String[] args) {
        pattern(5);
        
    }
    static void pattern(int n){
        for(int row=0; row<=n; row++){
            int totalStar = n-row;
            for(int s=0; s<row; s++){
                System.out.print(" ");
            }

            for(int col=0; col<=totalStar; col++){
                System.out.print("* ");
            }
            System.out.println();
    }
    }
}
