import java.io.*;
import java.util.*;

public class Main {

	public static int solution(int N) {
		int[] dp = new int[N + 1];
		if(dp.length >= 2)
		    dp[1] = 1;
		if(dp.length >= 3)
		    dp[2] = 2;
		if(dp.length >= 4)
		    dp[3] = 5;
		int m = (int)Math.pow(10, 9) + 7;
		for(int i = 4; i < dp.length; i++){
		    dp[i] = ((2*dp[i - 1]) % m + (dp[i - 3]) % m) % m;
		}
		return dp[N];
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] dp = new int[n + 1];
		
		System.out.println(solution(n));
	}

}