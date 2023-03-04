import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        // 각 stage 마다 머물러있는 사용자수를 담는다 , 인덱스값이 스테이지번호
        float[] stage = new float[N+1]; 
        for(int i: stages){
            if(i==N+1){
                continue;
            }
            stage[i]++;
        }

        float[] fail_array = new float[N]; // 실패율을 담을 배열
        ArrayList<Float> index_array = new ArrayList<>(); // 실패율과 비교하여 answer에 index를 담아줄 배열
        float len = stages.length; // 실패율 비교시 분모 값
        
        int index = 0; // 배열의 index
        for(int i = 1; i<stage.length; i++){
            if(stage[i]!=0.0){ // 스테이지 i에 도착한 사람이 있을때
                fail_array[index]=stage[i]/len;
                index_array.add(stage[i]/len);
                len -= stage[i];
            } else { // 스테이지에 사람이 없으면 0 넣어주기
                fail_array[index]=0.0F;
                index_array.add(0.0F);
                continue;
            }
            index++;
        }
        Arrays.sort(fail_array); // 실패율을 정렬
        int num = 0;
        // 정렬하여 가장 큰 값부터 비교
        for(int i= fail_array.length-1; i>=0; i--){
            for(int j=0; j<index_array.size(); j++){
                if(fail_array[i]==index_array.get(j)){
                    answer[num]=j+1;
                    index_array.set(j, -1.F); // 작은 스테이지 먼저 넣어주고, 해당 값은 -1로
                    num++;
                    break;
                }
            }
        }

        return answer;
    }
}