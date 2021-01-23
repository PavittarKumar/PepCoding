import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        System.out.print(getMazePaths(0, 0, n - 1, m - 1));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sc == dc && sr == dr){
            ArrayList<String> output = new ArrayList<>();
            output.add("");
            return output;
        }
        
        if(sc > dc || sr > dr){
            ArrayList<String> output = new ArrayList<>();
            return output;
        }
        
        ArrayList<String> h, v, d, output;
        output = new ArrayList<>();
        
        //horizontal
        for(int i = 1; i <= dc; i++){
            
            h  = getMazePaths(sr, sc + i, dr, dc);
            
            for(int j = 0; j < h.size(); j++){
                output.add("h" + i + h.get(j));
            }
            
        }
        
        //vertical
        
        for(int i = 1; i <= dr; i++){
            
            v  = getMazePaths(sr + i, sc, dr, dc);
            
            for(int j = 0; j < v.size(); j++){
                output.add("v" + i + v.get(j));
            }
            
        }
        
        //diagonal
        
        for(int i = 1; i*i <= (dr*dr) + (dc*dc); i++){
            
            d  = getMazePaths(sr + i, sc + i, dr, dc);
            
            for(int j = 0; j < d.size(); j++){
                output.add("d" + i + d.get(j));
            }
            
        }
        
        return output;
        
    }

}