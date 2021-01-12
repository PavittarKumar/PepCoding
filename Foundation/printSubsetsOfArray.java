import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        for (int i = 0; i < (int) Math.pow(2, n); i++) {
            int bin = dtb(i);
            int div = (int) Math.pow(10, n - 1);
            for (int j = 0; j < n; j++) {
                int q = bin / div;
                int r = bin % div;
                bin = r;
                if (q == 1) System.out.print(arr[j] + "\t");
                else System.out.print("-\t");
                div /= 10;
            }
            System.out.println();
        }

    }

    public static int dtb(int n) {
        int ans = 0;
        int power = 1;
        while (n != 0) {
            int r = n % 2;
            ans += (power * r);
            power *= 10;
            n /= 2;
        }
        return ans;
    }

}