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

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
   Stack<Integer> index = new Stack<>();
    int[] output = new int[arr.length];
   
    for(int i = 0; i < arr.length; i++){
       if(index.isEmpty()) {
           index.push(i);
           output[i] = i + 1;
       } else {
           
           while(!index.isEmpty() && arr[index.peek()] < arr[i]) {
               index.pop();
           }
            if(index.isEmpty()) {
                output[i] = i + 1;
            }
            else output[i] = i - index.peek();
            index.push(i);
       }
    }
    return output;
 }

}

















