class Solution {
     private static void destroyArea(int i, int j, int n, int[][] copy){
        for(int x=i-1; x<=i+1; x++){
            if(x<0||x>=n) continue;
            else{
                for(int y=j-1; y<=j+1; y++){
                    if(y<0||y>=n) continue;
                    else copy[x][y]=1;
                }
            }
        }
    }
    public int solution(int[][] board) {
        int n=board.length;
        int[][] area=new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    destroyArea(i,j,n,area);
                }
            }
        }
        int answer=0;
        for(int i=0; i<area.length; i++){
            for(int j=0; j<area.length; j++){
                if(area[i][j]==0)
                    answer++;
            }
        }
        return answer;
    }
}