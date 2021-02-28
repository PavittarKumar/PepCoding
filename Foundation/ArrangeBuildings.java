import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.print(solve(n));
 }
public static long solve(int n){
    long end1 = 1, end0 = 1;
    
    for(int i = 1; i < n; i++){
        long f = end1 + end0;
        end0 = end1;
        end1 = f;
    }
    
    return (end0 + end1)*(end0 + end1);
}
}