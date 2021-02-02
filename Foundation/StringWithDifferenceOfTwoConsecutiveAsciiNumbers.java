import java.io.*;
import java.util.*;

public class Main {

    public static String solution(String str) {
        // write your code here
        StringBuilder s = new StringBuilder();
        s.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            s.append(str.charAt(i) - str.charAt(i - 1));
            s.append(str.charAt(i));
        }

        return s.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}