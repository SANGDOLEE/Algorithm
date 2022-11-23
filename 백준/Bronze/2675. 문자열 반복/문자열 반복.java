import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int T=kb.nextInt(); // 2
        for(int t=1; t<=T; t++){
            int n=kb.nextInt();
            String s=kb.next();

            int index=0;
            for(int i=0; i<s.length(); i++){
                for(int j=0; j<n; j++){
                    System.out.print(s.charAt(index));
                }
                index++;
            }
            System.out.println();
        }
    }
}
