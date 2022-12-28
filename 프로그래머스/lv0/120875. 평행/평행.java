
class Solution {
    public double find(int[] a, int[] b){
        // 기울기 공식 = y값의 증가량 / x값의 증가량
        return (double)(b[1]-a[1])/(b[0]-a[0]);
    }
    public int solution(int[][] dots) {
        int answer = 0;

        if (find(dots[0],dots[1])==find(dots[2],dots[3])){
            return 1;
        }

        if (find(dots[0],dots[2])==find(dots[1],dots[3])){
            return 1;
        }

        if (find(dots[0],dots[3])==find(dots[1],dots[2])){
            return 1;
        }
        return answer;
    }
}