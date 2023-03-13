class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
         String[] answer = new String[n];

        for(int i=0; i<n; i++){
            // or연산 -> 하나라도 벽('1')인 경우 1저장
            answer[i]=Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i]=answer[i].replace('0',' ');
            answer[i]=answer[i].replace('1','#');
            // 자릿수맞추기 (ex: 이진수 변환시 1은 00001이 아닌 1이다. )
            while(answer[i].length()<n){
                answer[i]=' '+answer[i];
            }
        }
        return answer;
    }
}