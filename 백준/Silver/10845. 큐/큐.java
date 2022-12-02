import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> Q = new LinkedList<>();
        int back = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            switch (type) {
                case "push":
                    back = Integer.parseInt(st.nextToken());
                    Q.offer(back);
                    break;
                case "pop":
                    if (Q.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(Q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(Q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(Q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(Q.isEmpty() ? -1 : Q.peek()).append("\n");
                    break;
                case "back":
                    sb.append(Q.isEmpty() ? -1 : back).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
