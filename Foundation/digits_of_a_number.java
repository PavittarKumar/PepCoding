import java.util.*;

public class Main {
    
    public static void calc(int n){
        if(n == 0) return;
        calc(n / 10);
        System.out.println(n%10);
    }

    public static void main(String[] args) {
        // write your code here  
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        calc(n);
    }
}