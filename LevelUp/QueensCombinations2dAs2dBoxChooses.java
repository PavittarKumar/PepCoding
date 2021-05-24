import java.io.*;

public class QueensCombinations2dAs2dBoxChooses {

    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf){
        // write your code here
        if(row >= tq) {
            if(tq == qpsf) System.out.println(asf);
            return;
        }
        
        if(tq < qpsf) return;
        
        if(col < tq - 1) {
            queensCombinations(qpsf + 1, tq, row, col + 1, asf + "q");
            queensCombinations(qpsf, tq, row, col + 1, asf + "-"); 
        } else {
            queensCombinations(qpsf + 1, tq, row + 1, 0, asf + "q\n");
            queensCombinations(qpsf, tq, row + 1, 0, asf + "-\n"); 
        }
        
        
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        queensCombinations(0, n, 0, 0, "");
    }
}