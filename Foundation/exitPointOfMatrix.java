import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        
        int[][] arr = new int [n][m];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr[i][j] = scn.nextInt();
        
        int dir = 0; // 0 --> east, 1 --> south, 2 --> west, 3 --> north
        int row = 0, col = 0;
        
        while((row != n && col != m) && (row != -1 && col != -1)){ // Whenever the index is out of bound then the player has escaped.
            if(arr[row][col] == 1){
                if(dir == 3) dir = 0;
                else dir++;
            }
            
            if(dir == 0) col++;
            else if(dir == 1) row++;
            else if(dir == 2) col--;
            else row--;
        }

        // Printing index Accordingly
        if(row == n) System.out.println(row - 1);
        else if(row == -1) System.out.println(0);
        else System.out.println(row);

        if(col == m) System.out.println(col - 1);
        else if(col == -1) System.out.println(0);
        else System.out.println(col);
    }
}