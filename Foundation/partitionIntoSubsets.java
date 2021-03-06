import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt(), k = scn.nextInt();
       
       long[][] dp = new long[n + 1][k + 1];
       
       for(int i = 0; i <= n; i++){
           for(int j = 0; j <= k; j++){
               dp[i][j] = -1;
           }
       }
       
       System.out.print(solve(n, k, dp));
       
   }
   
   public static long solve(int n, int k, long[][] dp){
       if(k == 0) return (long)0;
       if(n == k) return (long)1;
       
       if(dp[n][k] != -1) return dp[n][k];
       
       return dp[n][k] = solve(n - 1, k - 1, dp) + k*solve(n - 1, k, dp);
   }
   
}
      