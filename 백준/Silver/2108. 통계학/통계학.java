import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        int[][] cnt=new int[4001][2]; // 최빈값 구할 2차원배열 ( 양수:0열 음수:1열 )

        int sum=0;
        int max=Integer.MIN_VALUE; // 최대값 찾기 위한 변수

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            sum+=arr[i];
            if(arr[i]>0) cnt[arr[i]][0]++; // 음수일 경우
            else cnt[Math.abs(arr[i])][1]++; // 양수일 경우
        }
        Arrays.sort(arr);
        System.out.println(Math.round((double)sum/n));
        System.out.println(arr[arr.length/2]);

        // 빈도 최대값 찾기
        for(int i=0; i<cnt.length; i++){
           for(int j=0; j<cnt[i].length; j++){
               if(cnt[i][j]==0) continue;
               if(cnt[i][j]>max) max=cnt[i][j];
           }
        }
        // 최빈값이 여러개일경우 탐색
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<cnt.length; i++){
            for(int j=0; j<cnt[i].length; j++) {
                if (cnt[i][j] == 0) continue;
                if(cnt[i][j]==max){
                    if(j==0) list.add(i); // 양수면 그대로 추가
                    else list.add(i*(-1)); // 음수면 -1 곱해서 추가
                }
            }
        }
        Collections.sort(list);
        if(list.size()>1) System.out.println(list.get(1));
        else System.out.println(list.get(0));
        System.out.println(arr[n-1]-arr[0]);
    }
}




