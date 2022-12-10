import java.math.BigInteger;
class Solution {
    public String solution(String bin1, String bin2) {
         String answer = "";


        BigInteger a=new BigInteger(bin1,2);
        BigInteger b=new BigInteger(bin2, 2);

        BigInteger sum=a.add(b);

        answer=sum.toString(2);
        return answer;
    }
}