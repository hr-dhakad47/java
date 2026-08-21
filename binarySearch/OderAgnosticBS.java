package binarySearch;

public class OderAgnosticBS {
    public static void main(String[] args) {
        
        //check for Descending order
        // int[] arr = {100, 95, 88, 72, 64, 50, 43, 31, 20, 5};
        // int target = 20;

        //check for Ascending order
        int[] arr = {-18, -12, -4, 0, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = oderAgnostic(arr,target);
        System.out.println(ans);
    }
    static int oderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
             if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            
                
            }
        }
        return -1;
    }
}
