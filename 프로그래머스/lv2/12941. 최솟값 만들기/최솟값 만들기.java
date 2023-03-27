import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
         int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0;
        int b = B.length-1;
        int i = 0;
        while(i < A.length){
            answer += A[a]*B[b];
            a++;
            b--;
            i++;
        }

        return answer;
    }
}