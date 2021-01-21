import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        
        String b;
        char a;
        a = str.charAt(0);
        b = str.substring(1);
        
        ArrayList<String> arr1 = gss(b);
        ArrayList<String> arr2 = new ArrayList<>();
        
        for(String el: arr1){
            arr2.add("" + el);
        }
        for(String el: arr1){
            arr2.add(a + el);
        }
        return arr2;
    }

}