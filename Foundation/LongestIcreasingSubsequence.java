//2D DP array approach
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
        
        if(dp[idx][lastIndex + 1] != -1) return dp[idx][lastIndex + 1];
        
        int f1 = solve(arr, idx + 1, lastIndex, dp);
        int f2 = 0;
        if(lastIndex == -1 || arr[idx] > arr[lastIndex]){
            f2 = 1 + solve(arr, idx + 1, idx, dp);
        }
        int ans = Math.max(f1, f2);
        dp[idx][lastIndex + 1] = ans;
        return ans;
    }

}

// Another Approach ... for 1D array of DP

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = scn.nextInt();
//         }
        
//         int ans = 0, max = 0;
        
//         for(int i = 0; i < arr.length; i++){
            
//             int[] dp = new int[arr.length + 1];
//             for(int j = 0; j < dp.length; j++) dp[j] = -1;
//             ans = solve(arr, i, dp);
            
//             max = Math.max(ans, max); 
//         }
        
//         System.out.print(max);
        
//     }
    
//     public static int solve(int[] arr, int idx, int[] dp){
        
//         if(idx == arr.length) return 0;
        
//         if(dp[idx] != -1) return dp[idx];
        
//         int ans = 0;
        
//         for(int i = idx + 1; i < arr.length; i++){
//             if(arr[i] > arr[idx]){
//                 ans = Math.max(ans, solve(arr, i, dp));
//             }
//         }
//         return dp[idx] = ans + 1;
//     }

// }