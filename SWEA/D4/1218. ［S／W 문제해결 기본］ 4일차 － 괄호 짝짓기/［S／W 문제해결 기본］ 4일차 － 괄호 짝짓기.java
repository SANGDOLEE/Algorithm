import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = 10;
        for (int t = 1; t <= T; t++) {
            int n=kb.nextInt();
            String s=kb.next();

            Stack<Character> stack=new Stack<>();

            for(char x:s.toCharArray()){
                if(x==')' && stack.peek()==('(')) stack.pop();
                else if(x==']' && stack.peek()==('[')) stack.pop();
                else if(x=='}' && stack.peek()==('{')) stack.pop();
                else if(x=='>' && stack.peek()==('<')) stack.pop();
                else stack.push(x);
            }
            if(stack.isEmpty()) System.out.println("#"+t+" "+1);
            else System.out.println("#"+t+" "+0);


        }
    }
}



