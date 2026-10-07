package Recursion.array_questions;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,4,35,6576,7,7,545,6567,68,76,54,43,7,34658,7654};
        ArrayList<Integer> ans = search(arr, 0, 7, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> search(int[] arr, int i, int target, ArrayList<Integer> list){
        if(i==arr.length){
        return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return search(arr, i+1, target, list);
    }

   
}
