import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        
        int[][] dp = new int[s1.length()][s1.length()];
        
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        
        System.out.print(solvet(s1));
    }
    
    public static int solve(String s1, int s, int e, int[][] dp){
        
        if(s == e) return 1;
        if(s > e) return 0;
        
        if(dp[s][e] != -1) return dp[s][e];
        
        if(s1.charAt(s) == s1.charAt(e)){
            return dp[s][e] = 2 + solve(s1, s + 1, e - 1, dp);
        } else {
            return dp[s][e] = Math.max(solve(s1, s + 1, e, dp), solve(s1, s, e - 1, dp));
        }
        
    }
    
    public static int solvet(String s1){
        
        boolean[][] dp = new boolean[s1.length()][s1.length()];
        int count = 0;
        
        for(int i = 0; i < s1.length(); i++){
            dp[i][i] = true;
            count++;
            if(i < s1.length() - 1) {
                if(s1.charAt(i) == s1.charAt(i + 1)){
                    dp[i][i + 1] = true;
                    count++;
                }
            }
        }
        
        
        for(int col = 2; col < s1.length(); col++){
            
            int i = 0, j = col;
            
            while(i < s1.length() && j < s1.length()){
                if(s1.charAt(i) == s1.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = false;
                }
                if(dp[i][j]) count++;
                i++;
                j++;
            }
            
        }
        return count;
    }

}





// My aaproach GREEDY

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         String s1 = scn.nextLine();
        
//         System.out.print(solve(s1));
//     }
    
//     public static int solve(String s1){
    
//         int count = s1.length();
        
//         for(int i = 0; i < s1.length(); i++){
//             int l = i - 1, r = i + 1;
//             while(l >= 0 && r < s1.length()){
//                 if(s1.charAt(l) == s1.charAt(r)){
//                     count++;
//                 } else {
//                     break;
//                 }
//                 l--;
//                 r++;
//             }
            
//             l = i;
//             r = i + 1;
//             while(l >= 0 && r < s1.length()){

//                 if(s1.charAt(l) == s1.charAt(r)){
//                     count++;
//                 } else {
//                     break;
//                 }
//                 l--;
//                 r++;
//             }
            
//         }
        
        
//         return count;
//     }
// }