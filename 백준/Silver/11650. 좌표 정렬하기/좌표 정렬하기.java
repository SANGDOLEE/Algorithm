import java.util.*;

class Main {

    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        Arrays.sort(arr, (a1, a2) -> {
            if (a1[0] == a2[0]) {
                return a1[1] - a2[1];
            } else {
                return a1[0] - a2[0];
            }

        });
        for(int i=0; i<N; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}




