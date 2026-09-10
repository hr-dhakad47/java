package pattern;

public class Pattern17 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int row=1; row<=2*n; row++){
            int space = row <= n ? n-row : row-n ;

            for(int s=0; s<space; s++){
                System.out.print(" ");
            }
            
            int sout = row <=n ? row : 2*n-row;

            for(int col=sout; col>=1; col--){
                System.out.print(col);
                }
            for(int col=2; col<=sout; col++){
                System.out.print(col);
            }
            System.out.println();
                   
        }
    }
}
