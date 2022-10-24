class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer="";
        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0])){ // id가 동일한게 있다면
                if(db[i][1].equals(id_pw[1])){ // pw도 동일하다면
                    answer="login"; // login
                    break;
                }else { // id는 동일한데 pw가 다르다면
                    answer = "wrong pw"; //wrong pw
                    break;
                }
            }else // id조차 동일한게 없다면
                answer="fail"; // fail
        }
        return answer;
    }
}