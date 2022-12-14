// 1. char to int : 아스키 이용
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int n=0;

        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0'&&my_string.charAt(i)<='9')
                n=n*10+my_string.charAt(i)-'0';
            else{
                answer+=n;
                n=0;
            }
        }
        if(n!=0) answer+=n;
        return answer;
    }
}

// 2. String to int 
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String temp = "";
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                temp += my_string.charAt(i);
            }
            else {
                if(temp.length() != 0) answer += Integer.parseInt(temp);
                temp = "";
            }
        }
        if(temp.length() != 0) answer += Integer.parseInt(temp);
        return answer;
    }
