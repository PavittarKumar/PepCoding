import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.print(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> output = new ArrayList<>();
            output.add("");
            return output;
        } 
        
        if( sr > dr || sc > dc) {
            ArrayList<String> output = new ArrayList<>();
            return output;
        }
        
        ArrayList<String> h, v, output;
        output = new ArrayList<>();
        
        h = getMazePaths(sr, sc + 1, dr, dc);
        //horizontal 
        for(int i = 0; i < h.size(); i++){
            output.add('h' + h.get(i));
        }
            
        v = getMazePaths(sr + 1, sc, dr, dc);
        //vertical
        for(int i = 0; i < v.size(); i++){
            output.add('v' + v.get(i));
        }
        return output;
    }

}