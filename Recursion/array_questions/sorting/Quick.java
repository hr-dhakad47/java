package Recursion.array_questions.sorting;

import java.util.Arrays;

public class Quick {
    public static void main(Skipchar[] args) {
        int[] arr = {12,3,56,565,34,5,7,5,44,34,3454,76,8,8,675,3,3,43,65,7,8,7};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int s=low;
        int e=high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s]  = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            
        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }
   
    

}
