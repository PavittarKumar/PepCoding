import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
    Stack<Integer> s = new Stack<>();
    int[] output = new int[arr.length];
   
    for(int i = arr.length - 1; i >= 0; i--){
       if(s.isEmpty()) {
           s.push(arr[i]);
           output[i] = -1;
       } else {
           
           while(!s.isEmpty() && s.peek() < arr[i]) {
               s.pop();
           }
            if(s.isEmpty()) {
                output[i] = -1;
            }
            else output[i] = s.peek();
            s.push(arr[i]);
            
       }
    }
    return output;
 }

}
























