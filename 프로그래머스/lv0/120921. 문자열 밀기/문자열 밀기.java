class Solution {
    public int solution(String a, String b) {
        int answer = 0;

        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < a.length(); i++) {
            if(b.equals(sb.toString())){
                break;
            }else{
                //hello
                char c=sb.charAt(a.length()-1);
                sb.deleteCharAt(a.length()-1);
                sb.insert(0,c);
                answer++;
            }
        }
        if(answer==a.length()) answer=-1;
        return answer;
    }
}