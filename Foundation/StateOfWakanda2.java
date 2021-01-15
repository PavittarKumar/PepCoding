import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int count = 0;
        while(count < n){
            int index = 0;
            for(int i = count; i < n; i++){
                System.out.println(arr[index][i]);
                index++;
            }
            count++;
        }
    }

}