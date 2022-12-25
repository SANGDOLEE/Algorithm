class Solution {
    public int[] solution(int num, int total) {
       int[] answer = new int[num];

        int middle = total / num; // 중간 값
        int sub = total % num == 0 ? num / 2 : num / 2 - 1; // 중간 값으로부터 -몇부터 시작할지

        int start = middle - sub; // 시작 number
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}