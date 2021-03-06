import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            s2 += s1.charAt(i);
        }
        System.out.print(solve(s1, s2));
    }
    
    public static int solve(String s1, String s2){
        
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

}













