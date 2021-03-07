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
        int[][] dp = new int[s1.length()][s1.length()];
        
        for(int i = 0; i < s1.length(); i++) dp[i][i] = 1;
        
        for(int col = 1; col < s1.length(); col++){
            
            int i = 0, j = col;
            
            while(i < s1.length() && j < s1.length()){
                if(s1.charAt(i) == s1.charAt(j)){
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
                i++;
                j++;
            }
            
        }
        return dp[0][s1.length() - 1];
    }

}




















