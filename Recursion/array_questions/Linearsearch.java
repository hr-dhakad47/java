package Recursion.array_questions;

public class Linearsearch {
    public static void main(String[] args) {
        int [] arr = {13,2,0,432,24,36,64,543,18,1,9};
        System.out.println(search(arr, 0, 18));
    }
    static boolean search(int[] arr, int i, int target){
        if(i==arr.length){
            return false;
        } 
        // if(arr[i]==target){
            return arr[i] == target || search(arr, i+1, target);
        }
        // return search(arr, i+1, target);
    }

