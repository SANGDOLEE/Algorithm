import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int a = 0, b = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        int max=-1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(arr[i][j]>=max){
                    max=arr[i][j];
                    a=i+1;
                    b=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(a+" "+b);
    }
}









