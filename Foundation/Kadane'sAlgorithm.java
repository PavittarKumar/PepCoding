import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int[] arr) {
    // write your code here
    int[] dp = new int[arr.length];
    dp[0] = arr[0];
    int max = Integer.MIN_VALUE;
    
    for(int i = 1; i < arr.length; i++){
        if(dp[i - 1] > 0) dp[i] = arr[i] + dp[i - 1];
        else dp[i] = arr[i];
        max = Math.max(max, dp[i]);
    }
    
    return max;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }
}