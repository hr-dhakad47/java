package linearSearch;

import java.util.Scanner;

public class Linear{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Elements: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element to need to be searched: ");
        int target = in.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

}
}