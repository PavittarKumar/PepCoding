import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(st.isEmpty() && (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')){
                st.push(s.charAt(i));
                continue;
            } else if(st.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                System.out.print(false);
                return;
            }
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                st.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && st.peek() == '(' ){
                st.pop();
            } else if(s.charAt(i) == '}' && st.peek() == '{' ) {
                st.pop();
            } else if(s.charAt(i) == ']' && st.peek() == '[' ) {
                st.pop();
            } else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']' ){
                System.out.print(false);
                return;
            }
            
        }
        System.out.print(st.isEmpty() );
    }

}














