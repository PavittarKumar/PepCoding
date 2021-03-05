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
        
        System.out.print(solve(arr, 0, -1));
        
    }
    
    public static int solve(int[] arr, int idx, int lastIndex){
        if(idx == arr.length) return 0;
        
        int f1 = solve(arr, idx + 1, lastIndex);
        int f2 = 0;
        if(lastIndex == -1 || arr[idx] > arr[lastIndex]){
            f2 = 1 + solve(arr, idx + 1, idx);
        }
        int ans = Math.max(f1, f2);
        return ans;
    }

}