package pattern;

public class Pattern18 {
    public static void main(String[] args) {
        pattern(10);
    }
   static void pattern(int n){
        for(int row=1; row<=n; row++){
            // for(int s=0; s<n-row; s++){
            //     System.out.print(" ");
            // }
            for (int col=1; col<=n; col++){
                int space = row>1 || row <= n/2 ? row*2-2 : row;
                for(int s=0; s<space; s++){
                System.out.print(" ");
                }
               
                    System.out.print("*");

                }
                System.out.println();
            }
               
            }
        }
// }
