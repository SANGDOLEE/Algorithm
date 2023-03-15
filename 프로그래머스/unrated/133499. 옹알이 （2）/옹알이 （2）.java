class Solution {
    public int solution(String[] babbling) {
       int answer = 0;

        String[] temp = {"aya","ye","woo","ma"};
        for(int i=0; i<babbling.length; i++){
            String s = babbling[i];
            if(babbling[i].contains("ayaaya")||babbling[i].contains("yeye")||babbling[i].contains("woowoo")||babbling[i].contains("mama")){
                continue;
            }
            for(int j=0; j<temp.length; j++){
                s=s.replace(temp[j]," ");
            }
            s=s.replace(" ","");
            if(s.length()==0) answer++;
        }
        return answer;
    }
}