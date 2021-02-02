import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String str) {
        // write your code here

        int count = str.length();

        for (int i = count - 1; i > 1; i--) {
            count *= i;
        }

        for (int i = 0; i < count; i++) {
            StringBuilder s = new StringBuilder(str);
            
            int div = str.length();
            int dvd = i;
            
            while(div > 0){
                int rem = dvd % div;
                dvd /= div;
                System.out.print(s.charAt(rem));
                s.deleteCharAt(rem);
                div--;
            }
            
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}