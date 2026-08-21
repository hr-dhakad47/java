// Q: find the ceiling of a number ? 

package binarySearch.BSquestions;

import java.util.Scanner;

public class Ceilingnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the "+size+" elements of array: ");
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number to find out the ceiling of number: ");
        int num = in.nextInt();
        int ans = ceiling(arr,num);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int num){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == num){
                return arr[mid];
            }
            if(isAsc){
                if(arr[mid]<num){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[mid]<num){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        
        return arr[start];
    }
    
}