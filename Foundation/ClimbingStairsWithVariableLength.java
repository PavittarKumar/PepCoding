import java.io.*;
import java.util.*;

public class Main {
    
    public static int solve(int[] jumps, int idx, int[] dp){
        
        if(idx == jumps.length) return 1;
        if(idx > jumps.length) return 0;
        
        int sum = 0;
        if(dp[idx] != 0) return dp[idx];
        
        for(int i = 1; i <= jumps[idx]; i++){
            sum += solve(jumps, idx + i ,dp);
        }
        
        return dp[idx] = sum;
        
    }
    
    public static int solvet(int[] jumps){
        int[] dp = new int[jumps.length + 1];
        
        dp[jumps.length] = 1;
        
        for(int i = jumps.length - 1; i >= 0; i--){
            int ans = 0;
            for(int j = 1; (j <= jumps[i]) && (i + j <= jumps.length); j++){
                ans += dp[i + j];
            }
            dp[i] = ans;
        }
        return dp[0];
        
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] jumps = new int[n];
        
        for(int i = 0; i < n; i++) jumps[i] = scn.nextInt();
        
        // int[] dp = new int[n + 1];
        
        System.out.print(solvet(jumps));
    }

}