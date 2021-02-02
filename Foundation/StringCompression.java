import java.io.*;
import java.util.*;

public class Main {

    public static String compression1(String str) {
        // write your code here
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(s.length() == 0){
                s.append(str.charAt(i));
                continue;
            }
            
            if(str.charAt(i) != s.charAt(s.length() - 1) ){
                s.append(str.charAt(i));
            }
            
        }
        return s.toString();
    }

    public static String compression2(String str) {
        // write your code here
        StringBuilder s = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(s.length() == 0){
                s.append(str.charAt(i));
                continue;
            }
            
            if(str.charAt(i) != s.charAt(s.length() - 1)){
                if(count != 1) s.append(count);
                count = 0;
                s.append(str.charAt(i));
            }
            count++;
        }
        if(count != 1) s.append(count);
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}