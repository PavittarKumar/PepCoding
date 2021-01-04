import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt(), b = scr.nextInt();
        int maximum = Math.max(a, b), minimum = a + b - maximum;
        int hcf, lcm, rem;
        
        //finding the HCF by long division method
        while (true) {
            rem = maximum % minimum;
            if (rem == 0) {
                break;
            }
            maximum = minimum;
            minimum = rem;
        }
        System.out.println(minimum);
        //finding the lcm using HCF * LCM = N1 * N2 formula
        System.out.print((a * b) / minimum);
    }
}