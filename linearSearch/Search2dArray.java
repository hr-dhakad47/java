package linearSearch;

import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args){
    int[][] arr = {
        {34,43,43},
        {3243,4454,656},
        {646,676,77}
    };
    int target = 7;
    int[] ans = search(arr, target);
    System.out.println(Arrays.toString(ans));
}
static int[] search(int[][]arr, int target){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j]==target){
                return new int[]{i,j};
            }
        }
    }
    return new int[]{-1,-1};
}
}

