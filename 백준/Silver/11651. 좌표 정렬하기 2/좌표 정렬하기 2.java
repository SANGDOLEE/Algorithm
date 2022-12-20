import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int N=kb.nextInt();
        int[][] arr=new int[N][2];
        for(int i=0; i<N; i++){
            arr[i][1]=kb.nextInt();
            arr[i][0]=kb.nextInt();
        }

        Arrays.sort(arr,(e1,e2)-> {
           if(e1[0]==e2[0]) {
               return e1[1]-e2[1];
           }else{
               return e1[0]-e2[0];
           }
        });

        for(int i=0; i<N; i++){
            System.out.println(arr[i][1]+" "+arr[i][0]);
        }

    }
}