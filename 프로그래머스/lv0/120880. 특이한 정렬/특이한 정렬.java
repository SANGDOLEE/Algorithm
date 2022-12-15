import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
         ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            arr.add(numlist[i]);
        }
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int absA=Math.abs(a-n);
                int absB=Math.abs(b-n);
                
                if(absA==absB){
                    if(a>b){
                        return -1;
                    }else{
                        return 1;
                    }
                }else{
                    return absA-absB;
                }
            }
        });
        int[] answer=new int[numlist.length];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}