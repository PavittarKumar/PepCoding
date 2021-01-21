import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.print(getKPC(s));

    }

    public static ArrayList < String > getKPC(String str) {

        if(str.length() == 0){
            ArrayList<String> output = new ArrayList<>();
            output.add("");
            return output;
        }
        
        ArrayList < String > map = new ArrayList <>() ;
        map.add(".;"); //0
        map.add("abc"); //1
        map.add("def"); //2
        map.add("ghi"); //3
        map.add("jkl"); //4
        map.add("mno"); //5
        map.add("pqrs"); //6
        map.add("tu"); //7
        map.add("vwx"); //8
        map.add("yz"); //9
        
        char f = str.charAt(0);
        
        ArrayList<String> ros = getKPC(str.substring(1));
        ArrayList<String> output = new ArrayList<>();
        
        for(int i = 0; i < map.get(f - '0').length(); i++){
            for(int j = 0; j < ros.size(); j++){
                output.add(map.get(f - '0').charAt(i) + ros.get(j));
            }
        }
        return output;
    }

}