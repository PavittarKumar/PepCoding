import java.io.*;
import java.util.*;

public class Main {
    
    public static int solve(int n, int[] dp){
        
        if(n < 0){
            return 0;
        } else if(n == 0) return 1;
        
        if(dp[n] != -1) return dp[n];
        
        int a, b, c;
        
        a = solve(n - 1, dp);
        b = solve(n - 2, dp);
        c = solve(n - 3, dp);
        
        return dp[n] = a + b + c;
    }
    
    public static int solvet(int n){
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        for(int i = 1; i <= n; i++){
            if(i - 1 < 0) dp[i] = 0;
            if(i - 2 < 0) dp[i] = dp[i - 1];
            else if(i - 3 < 0) dp[i] = dp[i - 1] + dp[i - 2];
            else dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] dp = new int[n + 1];
        // for(int i = 0; i <= n; i++) dp[i] = -1;
        System.out.print(solvet(n));
        
    }

}