// This question is similar to other Palindromic String of DP

// My approach

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        
        System.out.print(solve(s1));
    }
    
    public static int solve(String s1){
        int max = 1;
        
        for(int i = 0; i < s1.length(); i++){
            int l = i - 1, r = i + 1;
            int localMax = 1;
            while(l >= 0 && r < s1.length()){
                
                
                if(s1.charAt(l) == s1.charAt(r)){
                    localMax += 2;
                    max = Math.max(localMax, max);
                } else {
                    max = Math.max(localMax, max);
                    break;
                }
                l--;
                r++;
            }
        }
        
        for(int i = 0; i < s1.length(); i++){
            int l = i, r = i + 1;
            int localMax = 0;
            while(l >= 0 && r < s1.length()){

                if(s1.charAt(l) == s1.charAt(r)){
                    localMax += 2;
                    max = Math.max(localMax, max);
                } else {
                    max = Math.max(localMax, max);
                    break;
                }
                l--;
                r++;
            }
        }
        
        return max;
    }
}

























