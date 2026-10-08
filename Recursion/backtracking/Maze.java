package Recursion.backtracking;

import java.util.ArrayList;


public class Maze {
    public static void main(String[] args) {
        // System.out.println(pathCount(3,3));
        // pathCount("",3,3);
        // System.out.println(pathCount("", 3 ,3));
        System.out.println(pathCountDiagonal("", 03, 03));
        
    }
    
//     static int pathCount(int r, int c){
//         if(r==1 || c==1){
//             return 1;
//         }
//     int left = pathCount(r-1, c);
//     int right = pathCount(r, c-1);
    
//     return left+right ;
// }

    // static void pathCount(String p, int r, int c){
    //     if(r==1 && c==1){
    //         System.out.println(p);
    //         return ;
    //     }
        
    //     if(r>1){
    //         pathCount(p+'D', r-1, c);
    //     }
    //     if(c>1){
    //         pathCount(p+'R', r, c-1);
    //     }
    // }

    // static ArrayList<String> pathCount(String p, int r, int c){
    //     if(r==1 && c==1){
    //         ArrayList<String> list = new ArrayList<>(); 
    //         list.add(p);
    //         return list;
    //     }

    //     ArrayList<String> ans = new ArrayList<>(); 

        
    //     if(r>1){
    //         ans.addAll(pathCount(p+'D', r-1, c));
    //     }
    //     if(c>1){
    //         ans.addAll(pathCount(p+'R', r, c-1));
    //     }
    //     return ans;
    // }    

    static ArrayList<String> pathCountDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>(); 
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>(); 

        if(r>1 && c>1){
            ans.addAll(pathCountDiagonal(p+'D', r-1, c-1));
        }
        if(r>1){
            ans.addAll(pathCountDiagonal(p+'V', r-1, c));
        }
        if(c>1){
            ans.addAll(pathCountDiagonal(p+'H', r, c-1));
        }
        return ans;
    }    
}