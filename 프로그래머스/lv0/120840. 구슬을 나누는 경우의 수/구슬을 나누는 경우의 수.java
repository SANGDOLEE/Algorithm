class Solution {
        int[][] dy=new int[31][31];
    public int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(r==0||n==r){
            return 1;
        }else
            return DFS(n-1,r-1)+DFS(n-1,r);
    }
    public int solution(int balls, int share) {
        return DFS(balls, share);
    }
}