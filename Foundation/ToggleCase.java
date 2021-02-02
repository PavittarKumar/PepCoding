import java.io.*;
import java.util.*;

public class Main {

    public static String toggleCase(String str) {
        //write your code here
        StringBuilder s = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if((int)c >= (int)'a') s.append((char)((int)c - (int)('a' - 'A')));
            else s.append((char)((int)c + (int)('a' - 'A')));
        }

        return s.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}