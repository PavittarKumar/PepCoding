import java.io.*;

public class QueensCombinations2dAs1dQueenChooses {

    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
        // write your code here
        
        if(tq == qpsf) {
            for(int row = 0; row < chess.length; row++) {
                for(int col = 0; col < chess[row].length; col++) {
                    System.out.print(chess[row][col] ? "q\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
        for(int i = lcno + 1; i < tq*tq; i++) {
            int row = i / tq;
            int col = i % tq;
            chess[row][col] = true;
            queensCombinations(qpsf + 1, tq, chess, i);
            chess[row][col] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}

































