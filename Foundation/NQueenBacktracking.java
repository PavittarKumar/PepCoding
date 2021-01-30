import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }
    
        for(int col = 0; col < chess.length; col++){
            if(queenSafe(chess, row , col)){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
        
    }
    
    public static boolean queenSafe(int[][] chess, int row, int col){
        
        for(int i = 0; i < row; i++){
            if(chess[i][col] == 1) return false;
        }
        
        int x = row, y = col;
        while(x > -1 && y > -1){
            if(chess[x--][y--] == 1) return false; 
        }
        
        x = row - 1;
        y = col + 1;
        while(x > -1 && y < chess.length){
            if(chess[x--][y++] == 1) return false;
        }
        return true;
    }
}