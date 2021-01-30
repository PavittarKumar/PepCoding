import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(getStairPaths(n));
    }

    public static ArrayList < String > getStairPaths(int n) {
        
        if(n <= 0){
            ArrayList<String> output = new ArrayList<>();
            output.add("");
            return output;
        }
        
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> ros1 = getStairPaths(n - 1);
        
        for(int i = 0; i < ros1.size(); i++){
            output.add('1' + ros1.get(i));
        }
        
        ArrayList<String> ros2;
        ArrayList<String> ros3;
        if(n >= 2){ 
            ros2 = getStairPaths(n - 2);
            for(int i = 0; i < ros2.size(); i++){
                output.add('2' + ros2.get(i));
            }
        }
        if(n >= 3){
            ros3 = getStairPaths(n - 3);
            for(int i = 0; i < ros3.size(); i++){
                output.add('3' + ros3.get(i));
            }
        }
        
        return output;
    }

}