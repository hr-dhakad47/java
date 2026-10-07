package Recursion.FangQuestion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("", 4));;
        // ArrayList<String> ans = dice("", 4);
        // System.out.println(ans);
    }

    // static void dice(String p, int target){
    //     if(target==0){
    //         System.out.println(p);
    //         return;
    //     }

    //     for(int i=1; i<=6 && i<=target; i++){
    //         dice(p+i, target-i);
    //     }
    // }

    // static ArrayList<String> dice(String p, int target){
    //     if(target==0){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add    (p);
    //         return list;
    //     }
    //     ArrayList<String> ans = new ArrayList<>();
        
    //     for(int i=1; i<=6 && i<=target; i++){
    //         ans.addAll(dice(p+i, target-i));
    //     }
    //     return ans;
    // }


    static int dice(String p, int target){
        if(target==0){
            return 1;
        }
        int count = 0 ;
        for(int i=1; i<=6 && i<=target; i++){
            count = count + dice(p+i, target-i);
        }
        return count;
    }

}
