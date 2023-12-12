import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int temp = it.next();
            list.add(temp);
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i]=list.get(i);
        return answer;
    }
}