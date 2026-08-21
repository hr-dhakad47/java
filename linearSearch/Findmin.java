package linearSearch;


public class Findmin {
    public static void main(String[] args){
        int[] arr = {2,32,3,23,23,233,1,23};
        int ans = min(arr);
        System.out.println("Min value in the elements is: "+ans);

    }
    static int min(int[] arr){
        // if (arr.length == 0) {
        //     return -1;
        // }
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<ans){
            ans = arr[i];
            }
        }
        return ans;
    }
}
