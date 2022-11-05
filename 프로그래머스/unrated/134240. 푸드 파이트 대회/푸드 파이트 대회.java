class Solution {
    public String solution(int[] food) {
         String answer = "";
        String temp="";
        for(int i=1; i<food.length; i++){
            if(food[i]>1){ // 1보다 크고
                for(int j=0; j<food[i]/2; j++)
                    temp+=i;
                }
        }
        answer+=temp;
        StringBuilder sb=new StringBuilder();
        sb.append(temp).reverse();
        answer+=0;
        answer+=sb;
        return answer;
    }
}