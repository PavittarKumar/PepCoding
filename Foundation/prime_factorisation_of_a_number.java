import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here 
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int m = n;

        //We will find every prime factor till root n except one
        for (int i = 2; i * i <= n;) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
                continue;
            }

            i++;

        }

        //bigger prime factor after root n may or may not be there. If in the end n is 1 then there is no prime factor but if n!=0 then n is that prime factor.

        if (n != 1) System.out.print(n);

    }
}