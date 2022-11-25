import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);

        int h=kb.nextInt();
        int m=kb.nextInt();

        int t=kb.nextInt();
        int total=(h*60)+m+t; // 분으로 변경

        int hour=total/60;
        int min=total%60;

        if(hour<24){
            System.out.println(hour+" "+min);
        }else{
            System.out.println((hour-24)+" "+min);
        }
    }
}

