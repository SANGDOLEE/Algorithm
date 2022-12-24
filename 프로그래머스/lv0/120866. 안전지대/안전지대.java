class Solution {
    public int solution(int[][] board) {
          int n=board.length;
        int[][] area=new int[n+2][n+2];

        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                area[i][j]=board[i-1][j-1];
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(area[i][j]==1){
                    for(int x=i-1; x<=i+1; x++){
                        for(int y=j-1; y<=j+1; y++){
                            if(area[x][y]!=1) area[x][y]=2;
                        }
                    }
                }
            }
        }
        int answer=0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(area[i][j]==0) answer++;
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
        return answer;
    }
}