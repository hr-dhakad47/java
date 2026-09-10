package pattern;

public class Pattern16 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int row=1; row<=n; row++){
            for(int s=0; s<n-row; s++){
                System.out.print(" ");
            }
            int value = 1;
            for (int col=1; col<=row; col++){
                    System.out.print(value+" ");
                    value = ((value*(row-col))/col);
                }
               
                System.out.println();
            }
        }
    }

