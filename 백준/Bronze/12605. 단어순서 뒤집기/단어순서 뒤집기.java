import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        Stack<String> stack=new Stack<>();

        for(int t=1; t<=T; t++){
          String s=br.readLine();
          String[] arr=s.split(" ");
          for(int i=0; i<arr.length; i++)
              stack.push(arr[i]);

            System.out.print("Case #"+t+": ");
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
                System.out.print(" ");
                if(stack.isEmpty()) System.out.println();
            }
        }
    }
}