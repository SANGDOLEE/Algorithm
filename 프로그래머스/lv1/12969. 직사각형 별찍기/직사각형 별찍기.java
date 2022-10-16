import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}