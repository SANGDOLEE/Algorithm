class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        String str = s.toLowerCase();
        for(char x:str.toCharArray()){
            if (x=='p') p++;
            else if (x=='y') y++;
        }

        return (p == y ? true : false);
    }
}