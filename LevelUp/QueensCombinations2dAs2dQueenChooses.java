import java.io.*;

public class QueensCombinations2dAs2dQueenChooses {

    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int i, int j){
        // write your code here/
        
        if(qpsf == tq) {
            for(int row = 0; row < chess.length; row++) {
                for(int col = 0; col < chess[row].length; col++) {
                    System.out.print(chess[row][col] ? "q\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
       for(int row = i; row < chess.length; row++) {
           
           int col = row == i ? j + 1 : 0;
           
           for(; col < chess[row].length; col++) {
               chess[row][col] = true;
               queensCombinations(qpsf + 1, tq, chess, row, col);
               chess[row][col] = false;
           }
           
       }
        
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];
        
        queensCombinations(0, n, chess, 0, -1);
    }
}