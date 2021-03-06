import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] dp = new int[n + 1];
        
        for(int i = 0; i <= n; i++) dp[i] = -1;
        
        System.out.print(solvet(n));
    }
    
    public static int solve(int n, int[] dp){
        if(n == 1 || n == 0) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = (n - 1)*solve(n - 2, dp) + solve(n - 1, dp);
        
    }
    
    public static int solvet(int n){
        
        if(n == 1 || n == 0) return 1;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = (i - 1)*dp[i - 2] + dp[i - 1];
        }
        
        return dp[n];
    }

}