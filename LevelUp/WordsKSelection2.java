import java.io.*;
import java.util.*;

public class WordsKSelection2 {


  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int k = scn.nextInt();
    
    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for(char ch : str.toCharArray()){
        if(unique.contains(ch)== false){
            unique.add(ch);
            ustr+=ch;
        }
    }
    
    combination(0,ustr,0,k,"");
  }
  
  
  public static void combination(int index,String ustr,int ssf, int ts, String asf ){
      
      if(asf.length() == ts) {
          System.out.println(asf);
          return;
      }
      
      for(int i = index; i < ustr.length(); i++) {
          
          combination(i + 1, ustr, ssf, ts, asf + ustr.charAt(i));
          
      }
      
  }

}





































