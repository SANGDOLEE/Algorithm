class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < sizes.length; i++) {
            int a = sizes[i][0];
            int b = sizes[i][1];

            sizes[i][0] = Math.max(a,b);
            sizes[i][1] = Math.min(a,b);

            x = Math.max(sizes[i][0], x);
            y = Math.max(sizes[i][1], y);
        }
        return x * y;
    }
}