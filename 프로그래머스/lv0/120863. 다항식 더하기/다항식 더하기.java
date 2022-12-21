class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr=polynomial.split(" \\+ ");
        int xSum=0;
        int Sum=0;

        for(String x:arr){
            if(x.contains("x")){
                if(x.length()==1){
                    xSum+=1;
                }else {
                    String temp = x.replace("x","");
                    xSum+=Integer.parseInt(temp);
                }
            }else{
                Sum+=Integer.parseInt(x);
            }
        }
        if(xSum==0&&Sum!=0) answer=String.valueOf(Sum);
        else if(xSum!=0&&Sum==0) {
            if(xSum==1) answer="x";
            else answer = String.valueOf(xSum) + 'x';
        }
        else {
            if(xSum==1) answer="x"+" + "+ Sum;
            else answer = String.valueOf(xSum) + 'x' + " + " + Sum;
        }
        return answer;
    }
}