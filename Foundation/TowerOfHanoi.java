import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), x = scn.nextInt(), y = scn.nextInt(), z = scn.nextInt();
        toh(n , x, y ,z);
    }

    public static void toh(int n, int t1id, int t2id, int t3id) {
        if(n == 0) return;
        toh(n - 1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);
    }

}