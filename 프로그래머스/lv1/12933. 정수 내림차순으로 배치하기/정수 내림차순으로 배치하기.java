import java.util.*;
class Solution {
    public long solution(long n) {
      String s=String.valueOf(n);
      char[] c=s.toCharArray();
      Arrays.sort(c);
      String sb=new StringBuilder(new String(c)).reverse().toString();
      return Long.parseLong(sb);
    }
}