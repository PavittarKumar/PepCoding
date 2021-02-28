import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solvet(n));
 }
 public static int solve(int n){ // fibonacci approach
    int end0 = 1, end1 = 1;
    
    for(int i = 1; i < n; i++){
        int f = end0 + end1;
        end0 = end1;
        end1 = f;
    }
    return end0 + end1;
 }
 public static int solvet(int n){ // DP approach
     int[]end0 = new int[n];
     int[] end1 = new int[n];
     end0[0] = 1;
     end1[0] = 1;
     for(int i = 1; i < n; i++){
         end0[i] = end1[i - 1];
         end1[i] = end0[i - 1] + end1[i - 1];
     }
     return end0[n - 1] + end1[n - 1];
 }
}