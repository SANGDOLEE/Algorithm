
import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner kb=new Scanner(System.in);
        int T=kb.nextInt();
		  for(int test_case=1; test_case<=T; test_case++) {
            int n=kb.nextInt();
            int[] arr=new int[101];

            for (int i = 0; i < 1000; i++) {
                arr[kb.nextInt()]++; // 입력받은 점수 index ++;
            }
            int max = 0;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                    index = i; // 위치(index)가 곧 점수
                }
            }
            System.out.println("#" + n + " " + index);
        }
	}
}