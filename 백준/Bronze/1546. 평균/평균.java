import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        double[] arr=new double[n];
        int max=0;
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextDouble();
            max= (int) Math.max(arr[i],max);
        }

        double sum=0;
        for(int i=0; i<n; i++){
            sum+=((arr[i]/max)*100);
        }
        System.out.println(sum/n);


    }
}

