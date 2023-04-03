import java.util.*;

class Solution
{
    public int solution(String s)
    {
         int answer = 0;

        Stack<Character> stack = new Stack<>();
        int index = 0;

        stack.add(s.charAt(index++));
        while(index<s.length()){
            char ch = s.charAt(index++);

            if(!stack.empty() && stack.peek() == ch) stack.pop();
            else stack.push(ch);

        }
        return stack.isEmpty() ? 1 : 0;
    }
}