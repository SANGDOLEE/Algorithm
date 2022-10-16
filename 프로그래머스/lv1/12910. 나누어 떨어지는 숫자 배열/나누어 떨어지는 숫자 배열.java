import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer={};
        ArrayList<Integer> aList=new ArrayList<>();
        // divisor로 나누어 떨어지면 ArrayList에 추가
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                aList.add(arr[i]);
            }
        }
        // 만약에 추가된 값이 없고 비어있다면 -1
        if(aList.isEmpty()){
            aList.add(-1);
        }
        answer= new int[aList.size()];
        // ArrayList의 값을 배열 answer에 가져오기
        for(int i=0; i<aList.size(); i++){
            answer[i]=aList.get(i);
        }
        // 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}