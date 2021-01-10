import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int stars = n, space = 0;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++){
                if(i > 1 && i <= n/2 && j > 1 && j < stars) // main condition... Think it carefully
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            if(i <= n/2){
                space++;
                stars -= 2;
            } else {
                space--;
                stars += 2;
            }
            System.out.println();
        }
        
        
    }
}