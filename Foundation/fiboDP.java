import java.io.*;
import java.util.*;

public class Main{
    
    public static int fib(int x, int[] arr){
        if(x == 0 || x == 1) return x;
        
        int a, b;
        
        if(arr[x] != 0) return arr[x];
        
        a = fib(x - 1, arr);
        
        b = fib(x - 2, arr);
        
        return arr[x] = a + b;
        
    }
    
    public static int fibt(int x){
        int[] dp = new int[x + 1];
        
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= x; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[x];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int[] arr = new int[x + 1];
        System.out.println(fibt(x));
        
     }

}