class Solution {
    public String solution(String letter) {
        String answer = "";
        // a~z 모스부호
        String[] mos={".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpha={"a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] s=letter.split(" "); // 공백으로 분리해서 배열에 담음
        for(int i=0; i<s.length; i++){ // letter문자 하나씩
          for(int j=0; j<mos.length; j++){ // mos부호에서 검색
              if(s[i].equals(mos[j])) // 같은게 있으면
                  answer+=alpha[j]; // 해당 모스부호의 index값을 alpha에서 찾아서 추가 
          }
        }
        return answer;
    }
}