package pattern;

public class Pattern12 {
    public static void main(String[] args) {
        pattern(5);
        
    }
    static void pattern(int n){
        for(int row=0; row<n*2; row++){
            int totalStar = row<n ? n-row:row+1-n;
            int space = row<n ? row: 2*n-1-row;
            for(int s=0; s<space; s++){
                System.out.print(" ");
            }

            for(int col=0; col<totalStar; col++){
                System.out.print("* ");
            }
            System.out.println();
    }
    }
}
