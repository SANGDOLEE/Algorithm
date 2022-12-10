class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};

        for(int i=0; i<keyinput.length; i++){
            // key input = left or right-> answer[0]
            if(keyinput[i].equals("left")||keyinput[i].equals("right")){
                if(keyinput[i].equals("left")){
                    if(answer[0]>-(board[0]/2))
                        answer[0]--;
                }else{
                    if(answer[0]<board[0]/2)
                        answer[0]++;
                }
            // key input = down or up -> answer[1]     
            }else{
                if(keyinput[i].equals("down")){
                    if(answer[1]> -(board[1]/2))
                        answer[1]--;
                }else{
                    if(answer[1]<board[1]/2)
                        answer[1]++;
                }
            }
        }

        return answer;
    }
}