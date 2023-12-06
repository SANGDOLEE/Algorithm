class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int index = 0;
        int endex = p.length();
        while(index < t.length() - p.length()+1){
            String temp = t.substring(index,endex);
            int result = temp.compareTo(p);

            if ( result<0 || result == 0) answer++;
            index++;
            endex++;
        }
        return answer;
    }
}