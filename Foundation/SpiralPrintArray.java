import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr[i][j] = scn.nextInt();
        
        int rmin = 0, cmin = 0, rmax = n - 1, cmax = m - 1;
        int count = 0;
        while(count < n*m){
            for(int row = rmin; row <= rmax && count < n*m; row++){ //left boundary
                System.out.println(arr[row][cmin]);
                count++;
            }
            cmin++;
            for(int col = cmin; col <= cmax && count < n*m; col++){ //bottom boundary
                System.out.println(arr[rmax][col]);
                count++;
            }
            rmax--;
            
            for(int row = rmax; row >= rmin && count < n*m; row--){ //right boundary
                System.out.println(arr[row][cmax]);
                count++;
            }
            cmax--;
            for(int col = cmax; col >= cmin && count < n*m; col--){ //top boundary
                System.out.println(arr[rmin][col]);
                count++;
            }
            rmin++;
        }
        
    }

}