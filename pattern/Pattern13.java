package pattern;

public class Pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
      for(int row=1; row<n*2; row+=2){
          for(int s=0; s<n*2-row; s+=2){
              System.out.print(" ");
            } 
        // System.out.print("*");

        for (int col=0; col<row; col++){
            
            System.out.print("*");

        if(row>1 && row<n*2){
            // for(int i=1; i<n*2; i+=2){
                for (int j=0; j<row; j++){ 
                   System.out.print(" ");
            
                }
            // }
        }
            
            
        
        System.out.println();
    
    }  
    }}
}