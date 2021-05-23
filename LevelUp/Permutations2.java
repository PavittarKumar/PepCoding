import java.io.*;

public class Permutations2 {

  public static void permutations(int cb, int tb, int[] items, int ssf, int ts, String asf){
    // write your code here
    if(tb - cb + 1 < ts - ssf) return;
    if(cb > tb) {
        if(ssf == ts) {
            System.out.println(asf);
        }
        return;
    }
    // permutation approach * r!
    for(int i = 0; i < items.length; i++) {
        if(items[i] == 0) {
            items[i] = 1;
            int item = i + 1;
            permutations(cb + 1, tb, items, ssf + 1, ts, asf + item);
            items[i] = 0;
        }
    }
    permutations(cb + 1, tb, items, ssf, ts, asf + "0");
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(1, nboxes, new int[ritems], 0, ritems, "");
  }

}

































