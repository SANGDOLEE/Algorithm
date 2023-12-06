class Solution {
    public int solution(int n) {
        int answer = 0;

        String three = Integer.toString(n,3);
        
        StringBuilder sb = new StringBuilder();
        sb.append(three).reverse();
        String temp = sb.toString();
        
        answer = Integer.parseInt(temp,3);

        return answer;
    }
}