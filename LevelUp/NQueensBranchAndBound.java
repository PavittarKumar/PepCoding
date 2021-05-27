import java.io.*;

public class NQueensBranchAndBound {
    
    public static void solve(String chess, boolean[] colArr, boolean[] d1, boolean[] d2, int i) {
        
        if(i == colArr.length) {
            System.out.print(chess + ".\n");
            return;
            
        }
        
        for(int col = 0; col < colArr.length; col++) {
            if(!colArr[col] && !d1[i + col] && !d2[i - col + colArr.length - 1]) {
                colArr[col] = true;
                d1[i + col] = true;
                d2[i - col + colArr.length - 1] = true;
                solve(chess + i + "-" + col + ", ", colArr, d1, d2, i + 1);
                colArr[col] = false;
                d1[i + col] = false;
                d2[i - col + colArr.length - 1] = false;
            }
        }
        
    }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] chess = new boolean[n][n];
    //write your code here
    
    solve("", new boolean[chess.length], new boolean[2*chess.length - 1], new boolean[2*chess.length - 1], 0);
    
  }

}


























