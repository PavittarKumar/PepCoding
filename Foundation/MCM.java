import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(), m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m1; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        
        int n2 = scn.nextInt(), m2 = scn.nextInt();
        if(m1 != n2){
            System.out.print("Invalid input");
            return;
        }
        
        int[][] arr2 = new int[n2][m2];
        
        for(int i = 0; i < n2; i++){
            for(int j = 0; j < m2; j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        
        int[][] arr = new int [n1][m2];
        
        int r1 = 0, c1, r2, c2;
        
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m2; j++){
                for(int k = 0; k < m1; k++){
                    arr[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}