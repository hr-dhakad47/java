import java.util.Scanner;
import java.util.Arrays;
public class Input{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements: ");
        
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // for(int i=0; i<arr.length; i++){
        //     System.out.println("Element at index "+i+" is: "+arr[i]);
        // }    
        System.out.print(Arrays.toString(arr));
    }
}