class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str=s.split("");
        int[] index=new int[26];
        String[] alpha={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
        "p","q","r","s","t","u","v","w","x","y","z"};
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<alpha.length; j++) {
                if (str[i].equals(alpha[j])){
                    index[j]++;
                }
            }
        }
        for(int i=0; i<index.length; i++){
            if(index[i]==1)
                answer+=alpha[i];
        }
        return answer;
    }
}