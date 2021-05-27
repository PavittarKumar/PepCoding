import java.io.*;
    
public class NqueensCombinations2dAs1dQueenChooses {

    public static boolean IsQueenSafe(int[][] chess, int row, int col) {
        
        int[][] dir = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        
        for(int i = 1; i < chess.length; i++) {
            
            for(int j = 0; j < dir.length; j++) {
                
                int r = row + dir[j][0] * i;
                int c = col + dir[j][1] * i;
                
                if(r < chess.length && r >= 0 && c < chess.length && c >= 0) {
                    if(chess[r][c] != 0) return false;
                }
                
            }
            
        }
        
        return true;
        
    }

    public static void nqueens(int qpsf, int tq, int[][] chess) {
        // write your code here
        
        if(qpsf == tq) {
            
            for(int i = 0; i < chess.length * chess.length; i++) {
                int row = i/chess.length;
                int col = i % chess.length;
                System.out.print(chess[row][col] != 0 ? "q" + chess[row][col] + "\t" : "-\t");
                if(col == chess.length - 1) System.out.print("\n");
            }
            System.out.print("\n");
            return;
        }
        
        for(int i = 0; i < chess.length * chess.length; i++) {
            int row = i/chess.length;
            int col = i % chess.length;
            if(chess[row][col] == 0 && IsQueenSafe(chess, row, col)) {
                    chess[row][col] = qpsf + 1;
                    nqueens(qpsf + 1, tq, chess);
                    chess[row][col] = 0;
                }
        }
        
        
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        nqueens(0, n, chess);
    }
}