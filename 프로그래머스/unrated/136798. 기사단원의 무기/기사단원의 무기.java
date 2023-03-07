import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
       int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

         for(int i=1; i<=number; i++){
            int cnt=0;
            for(int j=1; j*j<=i; j++){
                if( j*j == i) cnt++;
                else if(i%j==0) cnt+=2;
            }
            list.add(cnt);
        }

        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)<=limit){
                answer+=list.get(i);
            } else {
                int temp = list.size() - i;
                answer += power * temp;
                break;
            }
        }
        return answer;

    }
}