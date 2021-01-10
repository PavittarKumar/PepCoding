import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int val = 1, spaces = ((n - 1) * 2) - 1, stars = 1;

        for (int i = 1; i <= n; i++) {
            int x = val;
            for (int j = 1; j <= stars; j++) {
                System.out.print(x + "\t");
                x++;
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= stars; j++) {
                if (--x == n) {
                    x--;
                    stars--;
                }
                System.out.print(x + "\t");
            }

            stars++;
            spaces -= 2;
            System.out.println();
        }
    }
}