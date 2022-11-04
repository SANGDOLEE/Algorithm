class Solution {
    public int solution(int[][] n) {
        int width=0;
        int height=0;
        int temp=n[0][1]; // 첫번째 인덱스의 y좌표
        for(int i=1; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                if(n[i][1]==temp) { // y좌표와 같은게 있다면
                    int max=Math.max(n[i][0],n[0][0]);
                    int min=Math.min(n[i][0],n[0][0]);
                    width=max-min; //  y좌표가 같을때 x의 차이 : 가로길이
                }
            }
        }
        int temp2=n[0][0]; // 첫번째 인덱스의 x좌표
        for(int i=1; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                if(n[i][0]==temp2){ // x좌표와 같은게 있다면
                    int max=Math.max(n[0][1],n[i][1]);
                    int min=Math.min(n[0][1],n[i][1]);
                    height=max-min; // x좌표가 같을때 y의 차이 : 세로길이
                }
            }
        }
        return height*width;
    }
}