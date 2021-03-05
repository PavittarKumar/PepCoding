import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int[][] dp = new int[arr.length + 1][arr.length + 1];
        
        for(int i = 0; i <= arr.length; i++){
            for(int j = 0; j <= arr.length; j++){
                dp[i][j] = -1;
            }
        }
        
        System.out.print(solve(arr, 0, -1, dp));
        
    }
    
    public static int solve(int[] arr, int idx, int lastIndex, int[][] dp){
        if(idx == arr.length) return 0;
        
        if(lastIndex != -1 && dp[idx][lastIndex] != -1) return dp[idx][lastIndex];
        
        int f1 = solve(arr, idx + 1, lastIndex, dp);
        int f2 = 0;
        if(lastIndex == -1 || arr[idx] > arr[lastIndex]){
            f2 = 1 + solve(arr, idx + 1, idx, dp);
        }
        int ans = Math.max(f1, f2);
        if(lastIndex != -1) dp[idx][lastIndex] = ans;
        return ans;
    }

}