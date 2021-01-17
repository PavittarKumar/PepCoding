import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x= scn.nextInt(), n = scn.nextInt();
        System.out.print(power(x,n));
    }

    public static int power(int x, int n) {
        if(n == 0) return 1;
        if(n % 2 == 0) return power(x*x, n/2);
        else return x*power(x*x, n/2);
    }

}