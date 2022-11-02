class Solution {
    public int solution(int[] array) {
               int answer=0;
       int arr_max=0;

       for(int i=0; i<array.length; i++){
           if(array[i]>arr_max){
               arr_max=array[i]; // arr_max=4;
           }
       }
       int[] index=new int[arr_max+1]; // index = 5칸
        int max=0;

        int n=0;
        for(int i=0; i<array.length; i++){
            index[array[i]]++;
        }
        for(int i=0; i<index.length; i++){
            if(index[i]>max){
                max=index[i];
                answer=i;
            }
        }
        for(int i=0; i<index.length; i++){
            if(index[i]==max){
                n++;
            }
        }
        if(n>1) answer=-1;
        return answer;
    }
}