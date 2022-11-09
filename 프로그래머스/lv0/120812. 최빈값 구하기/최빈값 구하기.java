class Solution {
 public int solution(int[] arr){
        int answer=0;
        int arr_max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr_max)
                arr_max=arr[i];
        }
        int[] index=new int[arr_max+1];
        for(int i=0; i<arr.length; i++){
            index[arr[i]]++;
        }
        int max=0; // 최빈 값
        for(int i=0; i<index.length; i++){
            if(index[i]>max) {
                max = index[i];
                answer=i;
            }
        }
        int cnt=0;
        for(int i=0; i<index.length; i++){
            if(index[i]==max)
                cnt++;
        }
        if(cnt>=2) answer=-1;
        return answer;
    }
}