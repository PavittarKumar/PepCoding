import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int k = 0; k < n; k++) {
            for (int i = k; i < n; i++) {
                for (int j = k; j <= i; j++) {
                    System.out.print(arr[j] + "\t");
                }
                System.out.println();
            }
        }

    }
}