package Recursion.FangQuestion;

import java.util.ArrayList;

public class Lc17 {
    public static void main(String[] args) {
        ArrayList<String> ans = phonePad("", "12");
        System.out.println(ans);
    }

    // static void phonePad(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }

    //     int digit = up.charAt(0) - '0';
    //     for(int i=(digit-1)*3; i<digit*3; i++){
    //         char ch = (char)('a' + i);
    //         phonePad(p+ch, up.substring(1));
    //     }
    // }


        //     Returning Results via Recursion

        // Instead of printing in the base case, each function call is responsible for:

        // 1.Creating its own local ArrayList<String> ans.

        // 2.Collecting all combinations returned by its child calls using ans.addAll(...).

        // 3.Returning its accumulated ans list to its parent caller.

        static ArrayList<String> phonePad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p); 
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>(); 
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            ans.addAll(phonePad(p+ch, up.substring(1)));
        }
        return ans  ;


         

    }
}



