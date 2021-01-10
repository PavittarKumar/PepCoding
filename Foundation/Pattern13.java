import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n = scn.nextInt();
        int val;
        
        //Printing the bionomial cofficient
        
        for(int i = 0; i < n; i++){
            val = 1;
            for(int j = 0; j <= i; j++){
                //reorder the formula by dividing ncr and nc(r+1)
                System.out.print(val + "\t");
                val = (val * (i-j))/(j+1);
            }
            System.out.println();
        }
    }
}