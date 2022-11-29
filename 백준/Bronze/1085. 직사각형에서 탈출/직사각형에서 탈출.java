import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);

        int x=kb.nextInt();
        int y=kb.nextInt();
        int w=kb.nextInt();
        int h=kb.nextInt();

        int a=Math.min(w-x,x);
        int b=Math.min(h-y,y);
        System.out.println(Math.min(a,b));

    }
}

