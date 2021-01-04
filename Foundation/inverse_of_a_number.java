import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt(), x = 1, help, m = 0;

        while (n > 0) {
            m += x * ((int) Math.pow(10, (n % 10) - 1));
            n /= 10;
            x++;
        }
        System.out.print(m);
    }
}