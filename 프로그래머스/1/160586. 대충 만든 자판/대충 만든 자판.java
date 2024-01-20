class Solution {
    public int[] solution(String[] keymap, String[] targets) {
      int[] answer = new int[targets.length];

        String totalString = "";
        for (int i = 0; i < keymap.length; i++) {
            totalString += keymap[i];
        }

        int cnt = 0;
        for (int i = 0; i < targets.length; i++) {

            cnt = 0;
            for (int j = 0; j < targets[i].length(); j++) {

                
                char ch = targets[i].charAt(j);
                if (!totalString.contains(String.valueOf(ch))) {
                    answer[i] = -1;
                    break;
                }
                int maxIndex = 999;
                for (int k = 0; k < keymap.length; k++) { // 찾을수는 있다면

                    String temp = keymap[k];
                    int index = temp.indexOf(ch);
                    if (index < maxIndex && index != -1) {
                        maxIndex = index;
                    }


                }
                cnt += maxIndex + 1;
                
            }
            if (answer[i] != -1) {
                answer[i] = cnt;
            }
        }
        return answer;
    }
}