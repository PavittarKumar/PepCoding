import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        
        String s = scn.nextLine();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == ')'){
                int count = 0;
                while(st.peek() != '('){
                    st.pop();
                    count++;
                }
                if(count == 0){
                    System.out.print(true);
                    return;
                }
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
            
        }
        System.out.print(false);
    }

}












