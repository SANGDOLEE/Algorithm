import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int cnt=0;
        String s=kb.next();
        for(int i=0; i<s.length(); i++){
          char c=s.charAt(i);
          if(c=='(') stack.add(c);
          else{
              if(stack.empty()) cnt++;
              else stack.pop();
          }
        }
        cnt+=stack.size();
        System.out.println(cnt);
    }
}