import java.io.*;

public class QueensPermutations2dAs2dQueenChooses {

    public static void queensPermutations(int qpsf, int tq, int[][] chess){
        // write your code here
        
        if(tq == qpsf) {
            for(int i = 0; i < chess.length; i++) {
                for(int j = 0; j < chess[i].length; j++) {
                    System.out.print(chess[i][j] != 0 ? "q" + chess[i][j] + "\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
        for(int i = 0; i < chess.length; i++) {
            for(int j = 0; j < chess[i].length; j++) {
                
                if(chess[i][j] == 0) {
                    chess[i][j] = qpsf + 1;
                    queensPermutations(qpsf + 1, tq, chess);
                    chess[i][j] = 0;
                }
                
            }
        }
        
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        
        queensPermutations(0, n, chess);
    }
}