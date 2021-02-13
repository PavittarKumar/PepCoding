import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) arr[i] = scn.nextInt();
        // int [] dp = new int[n + 1];
        // for(int i = 0; i <= n; i++) dp[i] = -1;
        
        int ans = solveGreedy(arr);
        if(ans == -1) System.out.print("null");
        else System.out.println(ans);
        
    }
    
    public static int solvet(int[] arr){
        int dp[] = new int[arr.length];
        dp[arr.length - 1] = 0;
        
        for(int i = arr.length - 2; i >= 0; i--){
            int min = 20; // according to the given constraints
            for(int j = 1; j <= arr[i] && i + j < arr.length; j++){
                min = Math.min(dp[i + j], min);
            }
            
            if(min == Integer.MAX_VALUE) min = Integer.MAX_VALUE;
            else dp[i] = min + 1;
        }
        return dp[0];
    }
    
    public static int solve(int[] arr, int idx, int[] dp){
        
        if(idx == arr.length - 1) return 0;
        int min = 20; // according to the given constraints
        // if(dp[idx] != -1) return dp[idx];
        for(int i = 1; i <= arr[idx] && idx + i < arr.length; i++){
            int countf = solve(arr, idx + i, dp);
            min = Math.min(min, countf);
        }
        
        return dp[idx] = min + 1;
        
    }
    
    //greedy
    public static int solveGreedy(int[] arr){
        
        //Time complexity is O(n) because i is changing according the jth loop
        int steps = 0;
        int i = 0;
        
        while(arr[i] != 0){
            int max = -1;
            int maxidx = i;
            for(int j = 1; j <= arr[i]; j++){
                
                if(i + j >= arr.length - 1){
                    steps++;
                    return steps;
                }
                
                if(i + j + arr[i + j] > max){
                    max = i + j + arr[i + j];
                    maxidx = i + j;
                }
            }
            i = maxidx;
            steps++;
        }
        
        return Integer.MAX_VALUE;
    }

}