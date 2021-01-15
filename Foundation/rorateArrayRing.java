import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt(), r = scn.nextInt();
        int[] a = fill1Dfrom2D(arr, s);
        
        rotate1D(a, r);
        fill2Dfrom1D(arr, a, s);
        display(arr);
        
    }
    
    public static int[] fill1Dfrom2D(int [][] arr, int s){
        int rmin = s - 1;
        int cmin = s - 1;
        int rmax = arr.length - s;
        int cmax = arr[0].length - s;
        
        int size = 2*(rmax + cmax - rmin - cmin);
        int[] la = new int[size];
        int idx = 0;
        
        for(int row = rmin; row <= rmax; row++){
            la[idx] = arr[row][cmin];
            idx++;
        }
        cmin++;
        for(int col = cmin; col <= cmax; col++){
            la[idx] = arr[rmax][col];
            idx++;
        }
        rmax--;
        for(int row = rmax; row >= rmin; row--){
            la[idx] = arr[row][cmax];
            idx++;
        }
        cmax--;
        for(int col = cmax; col >= cmin; col--){
            la[idx] = arr[rmin][col];
            idx++;
        }
        
        return la;
        
    }
    
    public static void rotate1D(int[] la, int r){
        
        r = r%la.length;
        if(r < 0) r+= la.length;
        
        reverse(la, 0, la.length - 1);
        reverse(la, 0, r - 1);
        reverse(la, r, la.length - 1);
    }
    
    public static void reverse(int[] a, int left, int right){
        while(left < right){
            a[left] = a[right] + a[left];
            a[right] = a[left] - a[right];
            a[left] = a[left] - a[right];
            right--;
            left++;
        }
    }
    
    public static void fill2Dfrom1D(int[][] arr, int[] a, int s){
        int rmin = s - 1, rmax = arr.length - s, cmin = s - 1, cmax = arr[0].length - s;
        int count = 0;
        for(int i = rmin; i <= rmax; i++){
            arr[i][cmin] = a[count];
            count++;
        }
        cmin++;
        for(int i = cmin; i <= cmax; i++){
            arr[rmax][i] = a[count];
            count++;
        }
        rmax--;
        for(int i = rmax; i >= rmin; i--){
            arr[i][cmax] = a[count];
            count++;
        }
        cmax--;
        for(int i = cmax; i >= cmin; i--){
            arr[rmin][i] = a[count];
            count++;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}