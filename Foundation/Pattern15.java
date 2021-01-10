import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int spaces = n/2, val = 1, stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            int x = val;
            for (int j = 1; j <= stars; j++) {
                System.out.print(x + "\t");
                if(j <= (stars)/2) x++;
                else x--;
            }
            System.out.println();
            if (i <= n / 2) {
                spaces--;
                val++;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
                val--;
            }
        }

    }
}