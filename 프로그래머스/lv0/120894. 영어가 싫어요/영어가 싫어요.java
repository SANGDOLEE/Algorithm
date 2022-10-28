public class Solution {
    public long solution(String numbers) {
        String[] s={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] n={"0","1","2","3","4","5","6","7","8","9"};
        String temp="";
        String result= "";
        for(char x:numbers.toCharArray()){
            temp+=x;
            for(int i=0; i<s.length; i++){
                if(temp.equals(s[i])){
                    result+=n[i];
                    temp="";
                }
            }
        }
        return Long.parseLong(result);
    }
}