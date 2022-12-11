import java.util.*;
class Main {
    public static void main(String args[]) throws Exception {
        Main T=new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[][] arr=new int[n][m];
        int[][] arr2=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr2[i][j]=kb.nextInt();
            }
        }
        int[][] sum=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}









