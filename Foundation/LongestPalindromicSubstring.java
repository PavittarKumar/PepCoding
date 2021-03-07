// This question is similar to other Palindromic String of DP except some minor changes

// My approach

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        
        System.out.print(solve(s1));
    }
    
    public static int solve(String s1){
        int max = 1;
        
        for(int i = 0; i < s1.length(); i++){
            int l = i - 1, r = i + 1;
            int localMax = 1;
            while(l >= 0 && r < s1.length()){
                
                
                if(s1.charAt(l) == s1.charAt(r)){
                    localMax += 2;
                    max = Math.max(localMax, max);
                } else {
                    max = Math.max(localMax, max);
                    break;
                }
                l--;
                r++;
            }
        }
        
        for(int i = 0; i < s1.length(); i++){
            int l = i, r = i + 1;
            int localMax = 0;
            while(l >= 0 && r < s1.length()){

                if(s1.charAt(l) == s1.charAt(r)){
                    localMax += 2;
                    max = Math.max(localMax, max);
                } else {
                    max = Math.max(localMax, max);
                    break;
                }
                l--;
                r++;
            }
        }
        
        return max;
    }
}

// DP

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.nextLine();
//         System.out.println(cpss(str));
//     }
    
//     public static int cpss(String str){
//         int n = str.length();
//         boolean[][] dp = new boolean[n][n];
//         int ans = 0;
        
//         for(int diag = 0; diag < n; diag++){
//             for(int i = 0, j = diag; j < n; i++,j++){
//                 if(diag == 0){
//                     dp[i][j] = true;
//                 }else if(diag == 1){
//                     if(str.charAt(i) == str.charAt(j)){
//                         dp[i][j] = true;
//                     }
//                 }else{
//                     if(str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1] == true){
//                         dp[i][j] = true;
//                     }
//                 }
//                 if(dp[i][j] == true){
//                     count++;
//                 }
//             }
//         }
//         return count;
        
        
//     }
    
    

// }























