import java.util.ArrayList;
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++){ // 0 1 2 3 4
            // 처음에 j=1로 뒀었는데, 그러면 외부포문이 돌때마다 j=0으로 바뀌어 항상 i+1로
            for(int j=i+1; j<numbers.length; j++){
                int a=numbers[i]+numbers[j];
                if(list.indexOf(a)<0) // list에 해당 값이 없으면 -1을 리턴하기때문에
                    list.add(a);
            }
        }
        int[] answer=new int[list.size()];
        for(int i=0; i<answer.length; i
            ++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}