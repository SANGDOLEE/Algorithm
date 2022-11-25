import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        String a = kb.next(); // 기본 문자열
        String b = kb.next(); // 폭발 문자열

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<a.length(); i++){
            stack.push(a.charAt(i));
            // 스택의 사이즈가 폭발 문자열의 길이보다 길면
            // 폭발 문자열이 존재할 수 있음
            if(stack.size()>=b.length()){
                boolean isSame=true;
                // 폭발 문자열의 길이만큼 반복
                for(int j=0; j<b.length(); j++){
                    // 스택의 길이 - 폭발 문자열의 길이를 빼고 거기서부터 시작
                    // 폭발 문자열과 다르면 탈출
                    if(stack.get(stack.size()-b.length()+j)!=b.charAt(j)){
                        isSame=false;
                        break;
                    }
                }
                if(isSame){
                    for(int j=0; j<b.length(); j++)
                        stack.pop();
                }
            }
        }
        for(char ch:stack){
            sb.append(ch);
        }

        System.out.println(sb.length()>0?sb.toString():"FRULA");
    }
}

