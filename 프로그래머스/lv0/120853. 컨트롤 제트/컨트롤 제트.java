import java.util.Stack;
class Solution {
    public int solution(String s) {
         int answer = 0;
        String[] arr=s.split(" ");// 공백을 기준으로 배열에 저장
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if (!arr[i].equals("Z")) {
                stack.push(Integer.parseInt(arr[i]));
            } else {
                if(!stack.isEmpty())
                    stack.pop();
            }
        }
        for(int i=0; i<stack.size(); i++){
            answer+=stack.get(i);
        }
        return answer;
    }
}