package Recursion.array_questions;
// rotated binary search
public class RBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,2,3,4};
        int target = 80;
        int ans = search(arr, 0, arr.length-1, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int s, int e, int target){
        if(s>e){
            return -1;
        }

        int mid = s+(e-s)/2;
        if(arr[mid] == target){
                    return mid;
                }
        
        if(arr[s]<=arr[mid]){

            if(arr[s]<=target && arr[mid]>=target){
               return search(arr, s, mid-1, target);
            }
            else{
                return search(arr, mid+1, e, target);
            }
        }
        if(arr[mid]<=target && arr[e] >= target){
            return search(arr, mid+1, e, target);
        }
        return search(arr, s, mid-1, target);
    }
}
