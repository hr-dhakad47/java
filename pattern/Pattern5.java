package pattern;

public class Pattern5 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for (int row=1; row<=n*2; row++){
            int st = row > n ? 2*n-row:row;
            for(int col=1; col<=st; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
