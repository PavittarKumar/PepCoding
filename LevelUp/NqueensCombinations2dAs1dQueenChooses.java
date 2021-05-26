import java.io.*;
    
public class NqueensCombinations2dAs1dQueenChooses {

    public static boolean IsQueenSafe(boolean[][] chess, int row, int col) {
        // write your code here
        for(int i = 0; i < col; i++) {
            if(chess[row][i]) return false;
        }
        
        for(int i = 0; i < row; i++) {
            if(chess[i][col]) return false;
        }
        
        int i = row - 1;
        int j = col - 1;
        
        while(i >= 0 && j >= 0) {
            if(chess[i--][j--]) return false;
        }
        
        i = row - 1;
        j = col + 1;
        
        while(i >= 0 && j < chess.length) {
            if(chess[i--][j++]) return false;
        }
        
        i = row + 1;
        j = col + 1;
        
        while(i < chess.length && j < chess.length) {
            if(chess[i++][j++]) return false;
        }
        
        i = row + 1;
        j = col - 1;
        
        while(i < chess.length && j >= 0) {
            if(chess[i++][j--]) return false;
        }
        
        return true;
        
    }

    public static void nqueens(int qpsf, int tq, boolean[][] chess, int lcno) {
        if (qpsf == tq) {
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    System.out.print(chess[row][col] ? "q\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = lcno + 1; i < chess.length * chess.length; i++) {
            int row = i / chess.length;
            int col = i % chess.length;

            if (chess[row][col] == false && IsQueenSafe(chess, row, col)) {
                chess[row][col] = true;
                nqueens(qpsf + 1, tq, chess, row * chess.length + col);
                chess[row][col] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        nqueens(0, n, chess, -1);
    }
}