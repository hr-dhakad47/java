package Recursion.array_questions.sorting;

import java.util.Arrays;

public class Merge {
    public static void main(Skipchar[] args) {
        int[] arr = {1,2,3,4,36,57,7,544,3,43,5,6,765,63};
        inplaceMergesort(arr, 0, arr.length-1);
        // arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // static int[] mergesort(int[] arr){
    //     if(arr.length == 1){
    //         return arr;
    //     }
    //     int mid = arr.length/2;

    //     // When splitting an array in Java, Arrays.copyOfRange(originalArray, startIndex, endIndex) is a 
    //     // built-in helper method that creates and returns a brand-new array containing elements from the 
    //     // original array.
    //     // The most critical rule to remember about this function is how it handles indices:

    //     // startIndex (inclusive): The element at this index is included.
    //     // endIndex (exclusive): The element at this index is NOT included (it stops right before this index).

    //     int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));

    //     int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

    //     return merge(left, right);
    // }

    // private static int[] merge(int[] first, int[] second){
    //     int[] mix = new int[first.length+second.length];
    //     int i=0;
    //     int j=0;
    //     int k=0;

    //     while(i<first.length && j<second.length){
    //         if(first[i]<second[j]){
    //             mix[k]=first[i];
    //             i++;
    //         }
    //         else{
    //             mix[k]=second[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while(i<first.length){
    //         mix[k] = first[i];
    //         i++;
    //         k++;
    //     }
    //      while(j<second.length){
    //         mix[k] = second[j];
    //         j++;
    //         k++;
    //     }
    //     return mix;
    // }


 static void inplaceMergesort(int[] arr, int s, int e){
        if(s>=e){
            return ;
        }
        int mid = s+(e-s)/2;

        // When splitting an array in Java, Arrays.copyOfRange(originalArray, startIndex, endIndex) is a 
        // built-in helper method that creates and returns a brand-new array containing elements from the 
        // original array.
        // The most critical rule to remember about this function is how it handles indices:

        // startIndex (inclusive): The element at this index is included.
        // endIndex (exclusive): The element at this index is NOT included (it stops right before this index).
        
        inplaceMergesort(arr, s, mid);

        inplaceMergesort(arr, mid+1, e);

        inplaceMerge(arr, s, mid, e);
    }

    private static void inplaceMerge(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
         while(j<=  e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }   
     }
}
