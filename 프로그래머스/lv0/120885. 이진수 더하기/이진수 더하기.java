import java.math.BigInteger;
class Solution {
    public String solution(String bin1, String bin2) {
         BigInteger sum=new BigInteger(bin1,2).add(new BigInteger(bin2,2));
        return sum.toString(2);
    }
}