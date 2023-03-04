import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
   int[] answer = new int[N];

        float[] stage = new float[N+1];
        for(int i: stages){
            if(i==N+1){
                continue;
            }
            stage[i]++;
        }

        float[] fail_array = new float[N];
        ArrayList<Float> index_array = new ArrayList<>();
        float len = stages.length;
        int start = 1;
        int index = 0;
        for(int i = 1; i<stage.length; i++){
            if(stage[i]!=0.0){
                fail_array[index]=stage[i]/len;
                index_array.add(stage[i]/len);
                len -= stage[i];
            } else {
                fail_array[index]=0.0F;
                index_array.add(0.0F);
                continue;
            }
            index++;
            start++;
        }
        Arrays.sort(fail_array);
        int num = 0;
        for(int i= fail_array.length-1; i>=0; i--){
            for(int j=0; j<index_array.size(); j++){
                if(fail_array[i]==index_array.get(j)){
                    answer[num]=j+1;
                    index_array.set(j, -1.F);
                    num++;
                    break;
                }
            }
        }

        return answer;
    }
}