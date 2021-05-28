import java.io.*;
import java.util.*;

public class PermutationsWords2 {

  public static void generateWords(int cc, String str, Character[] spots, HashMap<Character, Integer> lastOccurence) {
    // write your code here
    
    if(cc == str.length()) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(spots[i]);
        }
        System.out.print("\n");
        return;
    }
    
    for(int i = 0; i < spots.length; i++) {
        
        char c = str.charAt(cc);
        int prevLastOcc = lastOccurence.get(c);
        
        if(i > prevLastOcc && spots[i] == null) {
            
            lastOccurence.put(c, i);
            spots[i] = c;
            generateWords(cc + 1, str, spots, lastOccurence);
            spots[i] = null;
            lastOccurence.put(c, prevLastOcc);
            
        }
        
    }
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Character[] spots = new Character[str.length()];
    HashMap<Character, Integer> lastOccurence = new HashMap<>();
    for(char ch: str.toCharArray()){
      lastOccurence.put(ch, -1);
    }

    generateWords(0, str, spots, lastOccurence);
  }

}