import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);

        int T=kb.nextInt();
        for(int t=0; t<T; t++){
            int H=kb.nextInt(); // 층
            int W=kb.nextInt(); // 복도
            int N=kb.nextInt(); // 순서

            int floor;
            int room=0;

            if(N%H==0) {
                floor = H * 100;
                room=N/H;
            }
            else {
                floor = (N % H) * 100;
                room=(N/H)+1;
            }

            System.out.println(floor+room);
        }
    }
}




