package binarySearch.BSquestions;

public class InfiniteArray {
    public static void main(String[] args) {
       int[] arr = {12,34,40,56,90,100};
       int target = 40;
       System.out.println(array(arr,target));
    }
    static int array(int[] arr, int target){
         int start = 0;
         int end = 1;
         while(target>arr[end]){
                 int temp =end+1 ;
                 end = end+(end-start+1)*2;
                 start = temp;
             }
             return binarysearch(arr, target, start, end);
        }
        static int binarysearch(int[] arr, int target, int start, int end){
            while(start<=end){
                int mid = start+(end-start);
                if(target > arr[mid]){
                    start = mid+1;
                }
                else if(target<arr[mid]) {
                    end = mid-1;
                }
                else{
                    return mid;
                }

            }
            return -1;
        } 
}
