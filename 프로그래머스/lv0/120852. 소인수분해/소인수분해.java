import java.util.ArrayList;
public class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=2; i<=Math.sqrt(n); i++){
            while(n%i==0){
                list.add(i);
                n/=i;
            }
        }
        if(n!=1) list.add(n);
        for(int i=0; i<list.size(); i++){
            if(!list2.contains(list.get(i)))
                list2.add(list.get(i));
        }
        int[] answer=new int[list2.size()];
        for(int i=0; i<list2.size(); i++){
            answer[i]=list2.get(i);
        }
        return answer;
    }
}